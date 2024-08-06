const fs = require('fs');
const readline = require('readline');

function WriteHead(output) {
    fs.writeFile(
        output,
        `
    public class Test
    {
       public enum ErrorCode
       {
    
    `,
        () => {},
    );
}

function JavaFileToCSharpEnum(input, output) {
    if (
        input === undefined ||
        input === '' ||
        output === undefined ||
        output === ''
    )
        return;
    fs.access(input, fs.constants.R_OK, (err) => {
        if (err) {
            console.log(`${input}读取的文件不存在`);
            return;
        }

        //WriteHead(output);

        const rl = readline.createInterface({
            input: fs.createReadStream(input),
        });
        rl.on('line', (chunk) => {
            const line = chunk.toString().trim();
            if (line === undefined || line === '') return;

            if (line.startsWith('//')) return;

            const reg = /.+\(\d{5}/;
            if (reg.test(line)) {
                const data = line.match(reg)[0];
                const split = data.split('(');
                fs.appendFile(output, `${split[0]} = ${split[1]},\n`, () => {});
            }
        });
    });
}

JavaFileToCSharpEnum('./input/Message.java', './output/main.txt');
// JavaFileToCSharpEnum('./input/AdminMessage.java', './output/main.txt');
