package org.cyanspring.business.message;

import org.cyanspring.common.LangDef;
import org.cyanspring.common.SystemDefault;
import org.cyanspring.common.message.MessageType;

import java.util.HashMap;
import java.util.Map;

public enum AdminMessage {
	// 0 - 10000 reserved
    OK(0, MessageType.INFO, new String[][]{{LangDef.EN.getValue(), "OK"},
        {LangDef.ZH.getValue(), "成功"},
        {LangDef.ZHHK.getValue(), "成功"}}),
    FAILED(1, MessageType.ERROR, new String[][]{{LangDef.EN.getValue(), "FAILED"},
        {LangDef.ZH.getValue(), "失败"},
        {LangDef.ZHHK.getValue(), "失敗"}}),
    NONE(2, MessageType.INFO, new String[][]{{LangDef.EN.getValue(), "NONE"},
        {LangDef.ZH.getValue(), "不存在"},
        {LangDef.ZHHK.getValue(), "不存在"}}),

	// end enum

	// 60000 for Admin-Portal general message
    MISSING_FIELDS(60001, MessageType.ERROR, 
    		new String[][]{{LangDef.EN.getValue(), "Missing compulsory fields"}, 
			{LangDef.ZH.getValue(), "缺失必填栏位"},
			{LangDef.ZHHK.getValue(), "缺失必填欄位"}}),
    FIELDS_INCORRECT(60002, MessageType.ERROR,
    		new String[][]{{LangDef.EN.getValue(), "Fields incorrect"},
			{LangDef.ZH.getValue(), "栏位错误"},
			{LangDef.ZHHK.getValue(), "欄位錯誤"}}),
    UNIQUE_KEY_DUPLICATE(60003, MessageType.ERROR,
			new String[][]{{LangDef.EN.getValue(), "Unique key duplicate or wrong"},
			{LangDef.ZH.getValue(), "唯一约束重复或者错误"},
			{LangDef.ZHHK.getValue(), "Unique key重複或者錯誤"}}),
    SYSTEM_OFFLINE(60004, MessageType.ERROR,
			new String[][]{{LangDef.EN.getValue(), "System is offline"},
			{LangDef.ZH.getValue(), "系统离线中"},
			{LangDef.ZHHK.getValue(), "系統離線中"}}),
    ACTION_TOO_FAST(60005, MessageType.ERROR,
			new String[][]{{LangDef.EN.getValue(), "Action is too fast"}, 
			{LangDef.ZH.getValue(), "动作太快"},
			{LangDef.ZHHK.getValue(), "動作太快"}}),
    VALUE_LARGE_EQUAL_ZERO(60006, MessageType.ERROR,
			new String[][]{{LangDef.EN.getValue(), "Value must be equal to or larger than 0"},
			{LangDef.ZH.getValue(), "需要等于或大于0"},
			{LangDef.ZHHK.getValue(), "需要等於或大於0"}}),
    VALUE_LARGE_ZERO(60007, MessageType.ERROR,
			new String[][]{{LangDef.EN.getValue(), "Value must be larger than 0"},
			{LangDef.ZH.getValue(), "数值需要大于0"},
			{LangDef.ZHHK.getValue(), "數值需要大於0"}}),
    VALUE_LESS_EQUAL_ZERO(60008, MessageType.ERROR,
			new String[][]{{LangDef.EN.getValue(), "Value must be equal to or less than 0"},
			{LangDef.ZH.getValue(), "需要等于或小于0"},
			{LangDef.ZHHK.getValue(), "需要等於或小於0"}}),
    VALUE_LESS_ZERO(60009, MessageType.ERROR,
			new String[][]{{LangDef.EN.getValue(), "Value must be less than 0"},
			{LangDef.ZH.getValue(), "数值需要小于0"},
			{LangDef.ZHHK.getValue(), "數值需要小於0"}}),
    VALUE_NOT_EQUAL_ZERO(60010, MessageType.ERROR,
			new String[][]{{LangDef.EN.getValue(), "Value must not be equal 0"},
			{LangDef.ZH.getValue(), "数值不能等于0"},
			{LangDef.ZHHK.getValue(), "數值不能等於0"}}),
    ADMIN_NO_RIGHT(60011, MessageType.ERROR,
			new String[][]{{LangDef.EN.getValue(), "No right"}, 
			{LangDef.ZH.getValue(), "没有权限"},
			{LangDef.ZHHK.getValue(), "沒有權限"}}),
    ADMIN_LOGIN_FAILED(60012, MessageType.ERROR,
			new String[][]{{LangDef.EN.getValue(), "Login failed"}, 
			{LangDef.ZH.getValue(), "登录失败"},
			{LangDef.ZHHK.getValue(), "登錄失敗"}}),
    ADMIN_USER_EMPTY_EMAIL(60013, MessageType.ERROR, 
    		new String[][]{{LangDef.EN.getValue(), "Email is null"},
			{LangDef.ZH.getValue(), "电子邮件为空"},
			{LangDef.ZHHK.getValue(), "電子郵件為空"}}),
	ADMIN_USER_NOT_EXIST(60014, MessageType.ERROR, 
			new String[][]{{LangDef.EN.getValue(), "Admin Username or password incorrect."},
			{LangDef.ZH.getValue(), "管理员用户名或密码不正确。"},
			{LangDef.ZHHK.getValue(), "管理員使用者名稱或密碼不正確。"}}),
	ADMIN_EXCEEDED_MAX_FAILED_LOGIN_QUOTA(60015, MessageType.ERROR,
			new String[][]{{LangDef.EN.getValue(), "Login failed too many times"},
					{LangDef.ZH.getValue(), "客户端已超过最大登录失败次数"},
					{LangDef.ZHHK.getValue(), "客戶端已超過最大登錄失敗次數"}}),
	ADMIN_ID_DUPLICATE(60016, MessageType.ERROR,
			new String[][]{{LangDef.EN.getValue(), "Login ID duplicate"},
			{LangDef.ZH.getValue(), "Login ID重复或者错误"},
			{LangDef.ZHHK.getValue(), "Login ID重複或者錯誤"}}),
	CLIENT_USER_NOT_EXIST(60017, MessageType.ERROR, 
			new String[][]{{LangDef.EN.getValue(), "Client doesn't exist"},
			{LangDef.ZH.getValue(), "客户不存在"},
			{LangDef.ZHHK.getValue(), "客戶不存在"}}),
	INVALID_DOCUMENT_FORMAT(60018, MessageType.ERROR, 
			new String[][]{{LangDef.EN.getValue(), "Invalid document format"},
			{LangDef.ZH.getValue(), "文件格式不正确"},
			{LangDef.ZHHK.getValue(), "文件格式不正確"}}),
	DOCUMENT_SIZE_TOO_LARGE(60019, MessageType.ERROR, 
			new String[][]{{LangDef.EN.getValue(), "The document size is too large"},
			{LangDef.ZH.getValue(), "上传文件太大"},
			{LangDef.ZHHK.getValue(), "上傳文件太大"}}),
	UPLOAD_DOCUMENT_FAILED(60020, MessageType.ERROR, 
			new String[][]{{LangDef.EN.getValue(), "Upload document failed"},
			{LangDef.ZH.getValue(), "上传文件失败"},
			{LangDef.ZHHK.getValue(), "上傳文件失敗"}}),
	DOCUMENT_NOT_FOUND(60021, MessageType.ERROR, 
			new String[][]{{LangDef.EN.getValue(), "Document not found"},
			{LangDef.ZH.getValue(), "找不到文档"},
			{LangDef.ZHHK.getValue(), "找不到文檔"}}),
	DELETE_DOCUMENT_FAILED(60022, MessageType.ERROR,
			new String[][]{{LangDef.EN.getValue(), "Delete document failed"},
			{LangDef.ZH.getValue(), "删除文档失败"},
			{LangDef.ZHHK.getValue(), "刪除文檔失敗"}}),
	REFRESH_TOKEN_FAILED(60023, MessageType.ERROR,
			new String[][]{{LangDef.EN.getValue(), "Refresh token failed"},
			{LangDef.ZH.getValue(), "刷新Token失败"},
			{LangDef.ZHHK.getValue(), "刷新Token失敗"}}),
	INVALID_ACTION_APPROVAL_STATUS(60024, MessageType.ERROR, 
			new String[][]{{LangDef.EN.getValue(), "Invalid action for the current approval status"},
			{LangDef.ZH.getValue(), "无效操作对于现在的审批状态"},
			{LangDef.ZHHK.getValue(), "無效操作對於現在的審批狀態"}}),
	CANNOT_SAME_MAKER_CHECKER(60025, MessageType.ERROR,
			new String[][]{{LangDef.EN.getValue(), "maker and checker cannot be the same user"},
			{LangDef.ZH.getValue(), "maker 和 checker 不能是同一个用户"},
			{LangDef.ZHHK.getValue(), "maker 和 checker 不能是同一個用戶"}}),
	CANNOT_SAME_CHECKER(60026, MessageType.ERROR,
			new String[][]{{LangDef.EN.getValue(), "checker and second checker cannot be the same user"},
			{LangDef.ZH.getValue(), "checker 和 second checker 不能是同一个用户"},
			{LangDef.ZHHK.getValue(), "checker 和 second checker 不能是同一個用戶"}}),
	CREATE_SYSTEM_ACCOUNT_LOGIN_ID(60027, MessageType.ERROR,
			new String[][]{{LangDef.EN.getValue(), "Login ID length need 10 String"},
			{LangDef.ZH.getValue(), "Login ID 需要长度10字符串"},
			{LangDef.ZHHK.getValue(), "Login ID 需要長度10字符串"}}),
	ADMIN_USER_INACTIVE(60028, MessageType.ERROR,
			new String[][]{{LangDef.EN.getValue(), "Admin user inactive"},
			{LangDef.ZH.getValue(), "管理员用户无效"},
			{LangDef.ZHHK.getValue(), "管理員用戶無效"}}),
	INCORRECT_ADMIN_USER_OR_PASSWORD(60029, MessageType.ERROR,
			new String[][]{{LangDef.EN.getValue(), "Admin Username or password incorrect"},
			{LangDef.ZH.getValue(), "管理员用户名或密码不正确"},
			{LangDef.ZHHK.getValue(), "管理員用戶名或密碼不正確"}}),
	UPDATE_RECORD_CONFLICT(60030, MessageType.ERROR,
			new String[][]{{LangDef.EN.getValue(), "The record was changed. Please refresh and try again"},
			{LangDef.ZH.getValue(), "该记录已被更改。 请刷新并重试"},
			{LangDef.ZHHK.getValue(), "該記錄已被更改。 請刷新並重試"}}),
	JSON_PARSE_ERROR(60031, MessageType.ERROR, 
			new String[][]{{LangDef.EN.getValue(), "Json parse error"},
			{LangDef.ZH.getValue(), "Json解析错误"},
			{LangDef.ZHHK.getValue(), "Json解析錯誤"}}),
	USERNAME_EXIST(60032, MessageType.ERROR, 
			new String[][]{{LangDef.EN.getValue(), "Username exist"},
			{LangDef.ZH.getValue(), "用户名已存在"},
			{LangDef.ZHHK.getValue(), "用戶名已存在"}}),


	// Admin-Portal MMK user from 60500
	MMK_USER_NOT_EXIST(60501, MessageType.ERROR, 
			new String[][]{{LangDef.EN.getValue(), "Social user not exist"},
			{LangDef.ZH.getValue(), "社交用户不存在"},
			{LangDef.ZHHK.getValue(), "社交用戶不存在"}}),
	

	// Admin-Portal AO from 61000
	AO_FORM_ID_NOT_EXIST(61001, MessageType.ERROR, 
			new String[][]{{LangDef.EN.getValue(), "Ao-Form doesn't exist"},
			{LangDef.ZH.getValue(), "开户表格不存在"},
			{LangDef.ZHHK.getValue(), "開戶表格不存在"}}),
	AO_FORM_USER_NOT_EXIST(61002, MessageType.ERROR, 
			new String[][]{{LangDef.EN.getValue(), "Ao-Form Client doesn't exist"},
			{LangDef.ZH.getValue(), "开户客户不存在"},
			{LangDef.ZHHK.getValue(), "開戶客戶不存在"}}),
	AO_APPROVAL_STATUS_EMPTY(61003, MessageType.ERROR, 
			new String[][]{{LangDef.EN.getValue(), "Approval status is null"},
			{LangDef.ZH.getValue(), "审批状态为空"},
			{LangDef.ZHHK.getValue(), "審批狀態為空"}}),
	INVALID_ACTION_AO_FORM_STATUS(61004, MessageType.ERROR, 
			new String[][]{{LangDef.EN.getValue(), "Invalid action for the Ao-Form status"},
			{LangDef.ZH.getValue(), "无效操作对于Ao-Form的状态"},
			{LangDef.ZHHK.getValue(), "無效操作對於Ao-Form的狀態"}}),
	FAIL_REJECT_AO_FORM(61005, MessageType.ERROR, 
			new String[][]{{LangDef.EN.getValue(), "Fail to reject Ao-Form"},
			{LangDef.ZH.getValue(), "无法拒绝 Ao-Form"},
			{LangDef.ZHHK.getValue(), "無法拒絕 Ao-Form"}}),
	DUPLICATED_AO_FORM_KYC(61006, MessageType.ERROR, 
			new String[][]{{LangDef.EN.getValue(), "KYC document name duplicated"},
			{LangDef.ZH.getValue(), "KYC 文件名称重复"},
			{LangDef.ZHHK.getValue(), "KYC 文件名稱重複"}}),
	DEPOSIT_FORM_ID_NOT_EXIST(61007, MessageType.ERROR, 
			new String[][]{{LangDef.EN.getValue(), "Deposit-Form doesn't exist"},
			{LangDef.ZH.getValue(), "存款表格不存在"},
			{LangDef.ZHHK.getValue(), "存款表格不存在"}}),
	INVALID_ACTION_DEPOSIT_FORM_STATUS(61008, MessageType.ERROR, 
			new String[][]{{LangDef.EN.getValue(), "Invalid action for the Deposit-Form status"},
			{LangDef.ZH.getValue(), "无效操作对于Deposit-Form的状态"},
			{LangDef.ZHHK.getValue(), "無效操作對於Deposit-Form的狀態"}}),
	APPROVE_AO_FORM_BEFORE_DEPOSIT_FORM(61009, MessageType.ERROR, 
			new String[][]{{LangDef.EN.getValue(), "Ao-Form must be approved first"},
			{LangDef.ZH.getValue(), "Ao-Form必须先获得批准"},
			{LangDef.ZHHK.getValue(), "Ao-Form必須先獲得批准"}}),
	FAIL_REJECT_DEPOSIT_FORM(61010, MessageType.ERROR, 
			new String[][]{{LangDef.EN.getValue(), "Fail to reject Deposit-Form"},
			{LangDef.ZH.getValue(), "无法拒绝 Deposit-Form"},
			{LangDef.ZHHK.getValue(), "無法拒絕 Deposit-Form"}}),
	FAIL_CREATE_AYERS_ACCOUNT_SESSION(61011, MessageType.ERROR, 
			new String[][]{{LangDef.EN.getValue(), "Fail to create trading system account session"},
			{LangDef.ZH.getValue(), "无法建立交易系统账户会话"},
			{LangDef.ZHHK.getValue(), "無法創建交易系統帳戶會話"}}),
	FAIL_CREATE_CLIENT_INFO(61012, MessageType.ERROR, 
			new String[][]{{LangDef.EN.getValue(), "Fail to create client info"},
			{LangDef.ZH.getValue(), "创建客户信息失败"},
			{LangDef.ZHHK.getValue(), "創建客戶信息失敗"}}),
	FAIL_CREATE_CLIENT_BANK_ACCOUNT(61013, MessageType.ERROR, 
			new String[][]{{LangDef.EN.getValue(), "Fail to create client bank account info"},
			{LangDef.ZH.getValue(), "创建客户银行信息失败"},
			{LangDef.ZHHK.getValue(), "創建客戶銀行信息失敗"}}),
	AO_FORM_CLIENT_NOT_AGED_18_YEARS(61014, MessageType.ERROR, new String[][]{{LangDef.EN.getValue(), "Client not a aged 18 years."},
			{LangDef.ZH.getValue(), "客户未满 18 岁"},
			{LangDef.ZHHK.getValue(), "客戶未滿 18 歲"}}),
	AML_FATF_NATIONALITY_CHECKING_FAILED(61015, MessageType.ERROR, new String[][]{
			{LangDef.EN.getValue(), "User nationality is in FATF list. Please checking ao form."},
			{LangDef.ZH.getValue(), "用户国籍在 FATF 列表中。请检查开户表格"},
			{LangDef.ZHHK.getValue(), "用戶國籍在 FATF 列表中。 請檢查開戶表格。"}}),
	AML_FATF_COUNTRY_CHECKING_FAILED(61016, MessageType.ERROR, new String[][]{
			{LangDef.EN.getValue(), "User country is in FATF list. Please checking ao form."},
			{LangDef.ZH.getValue(), "用户居住国家在 FATF 列表中。请检查开户表格"},
			{LangDef.ZHHK.getValue(), "用戶居住國家在 FATF 列表中。 請檢查開戶表格。"}}),
	AML_HAS_LINK_WITH_POLITICIAN_CHECKING_FAILED(61017, MessageType.ERROR, new String[][]{
			{LangDef.EN.getValue(), "User is links with politically exposed persons. Please checking ao form."},
			{LangDef.ZH.getValue(), "用户与政治公众人物有联系。请检查开户表格"},
			{LangDef.ZHHK.getValue(), "用户與政治公眾人物有聯繫。 請檢查開戶表格。"}}),
	AML_JOB_PARTICULARLY_CHECKING_FAILED(61018, MessageType.ERROR, new String[][]{
			{LangDef.EN.getValue(), "User's job particularly susceptible to money laundering risk. Please checking ao form."},
			{LangDef.ZH.getValue(), "用户的工作特别容易受到洗钱风险影响。请检查开户表格"},
			{LangDef.ZHHK.getValue(), "用戶的工作特別容易受到洗錢風險影響。 請檢查開戶表格。"}}),
	MISS_INTERNAL_EXTERNAL_REASON(61019, MessageType.ERROR, new String[][]{
			{LangDef.EN.getValue(), "Missing internal and external reason."},
			{LangDef.ZH.getValue(), "缺少内部和外部原因。"},
			{LangDef.ZHHK.getValue(), "缺少內部和外部原因。"}}),
	MISS_NASDAQ_QUESTIONNAIRES_FORM(61020, MessageType.ERROR, new String[][]{
			{LangDef.EN.getValue(), "Missing nasdaq questionnaires form."},
			{LangDef.ZH.getValue(), "缺少纳斯达克问卷。"},
			{LangDef.ZHHK.getValue(), "缺少納斯達克問卷。"}}),
	AO_FORM_AYERS_ID_DUPLICATED(61021, MessageType.ERROR, new String[][]{
			{LangDef.EN.getValue(), "The Ayers trade account ID is duplicated, please try again with another ID"},
			{LangDef.ZH.getValue(), "Ayers交易账户 ID 重复，请使用其他 ID 重试"},
			{LangDef.ZHHK.getValue(), "Ayers交易帳號 ID 重複，請使用其他 ID 重試"}}),
	AO_FORM_ID_DOCUMENT_NOT_MATCH(61022, MessageType.ERROR, new String[][]{
			{LangDef.EN.getValue(), "The Ao Form's ID document does not match current client ID document"},
			{LangDef.ZH.getValue(), "Ao 表单的身份证件与现时客户的身份证件不相符"},
			{LangDef.ZHHK.getValue(), "Ao 表單的身份證件與現時客戶的身份證件不相符"}}),
	
	// Admin-Portal Funds 61500
	FUNDS_CREATE_CASH_IN_FAILED(61500, MessageType.ERROR, new String[][]{
			{LangDef.EN.getValue(), "Create cash-in failed."},
			{LangDef.ZH.getValue(), "创建入金失败。"},
			{LangDef.ZHHK.getValue(), "創建入金失敗。"}}),
	FUNDS_CASH_OUT_NOT_EXIST(61501, MessageType.ERROR, new String[][]{
			{LangDef.EN.getValue(), "Cash-out doesn't exist"},
			{LangDef.ZH.getValue(), "出金不存在"},
			{LangDef.ZHHK.getValue(), "出金不存在"}}),
	FUNDS_CLIENT_BANK_ACCOUNT_NOT_REGISTERED(61502, MessageType.ERROR, new String[][]{
			{LangDef.EN.getValue(), "Client bank account doesn't registered"},
			{LangDef.ZH.getValue(), "客户银行账户未在系统中注册"},
			{LangDef.ZHHK.getValue(), "客戶銀行賬戶未在系統中註冊"}}),
	FUNDS_CREATE_CASH_IN_OUT_AMOUNT_FAILED(61503, MessageType.ERROR, new String[][]{
			{LangDef.EN.getValue(), "Cash amount must be greater than 0."},
			{LangDef.ZH.getValue(), "现金数值需要大于0。"},
			{LangDef.ZHHK.getValue(), "現金數值需要大於0。"}}),
	FUNDS_CASH_IN_NOT_EXIST(61504, MessageType.ERROR, new String[][]{
			{LangDef.EN.getValue(), "Cash-In doesn't exist"},
			{LangDef.ZH.getValue(), "入金不存在"},
			{LangDef.ZHHK.getValue(), "入金不存在"}}),
	FUNDS_FUND_P_IO_ON_DATE_NOT_EXIST(61505, MessageType.ERROR,
			new String[][]{{LangDef.EN.getValue(), "Missing FundPIn/Out On Date fields"},
					{LangDef.ZH.getValue(), "缺失FundPIn/Out On Date"},
					{LangDef.ZHHK.getValue(), "缺失FundPIn/Out On Date"}}),
	FUNDS_MISSING_BANK_NO(61506, MessageType.ERROR,
			new String[][]{{LangDef.EN.getValue(), "Missing Bank Code / Bank Name"},
					{LangDef.ZH.getValue(), "缺失银行"},
					{LangDef.ZHHK.getValue(), "缺失銀行"}}),
	FUNDS_MISSING_CURRENCY(61507, MessageType.ERROR,
			new String[][]{{LangDef.EN.getValue(), "Missing Currency"},
					{LangDef.ZH.getValue(), "缺失货币"},
					{LangDef.ZHHK.getValue(), "缺失貨幣"}}),
	FUNDS_MISS_BANK_HOLDER_NAME_OR_NO(61508, MessageType.ERROR,
			new String[][]{{LangDef.EN.getValue(), "Missing Bank Account Number Or holder name"},
					{LangDef.ZH.getValue(), "缺失银行帐号或持有人姓名"},
					{LangDef.ZHHK.getValue(), "缺失銀行帳號或持有人姓名"}}),
	FUNDS_FUND_MISS_REMARKS(61509, MessageType.ERROR,
			new String[][]{{LangDef.EN.getValue(), "Missing Remarks"},
					{LangDef.ZH.getValue(), "缺失備註"},
					{LangDef.ZHHK.getValue(), "缺失備註"}}),
	
	// Admin-Portal client info 62000
	CLIENT_INFO_TRADE_ACCOUNT_NOT_EXIST(62000, MessageType.ERROR, new String[][]{
			{LangDef.EN.getValue(), "Client trade account not exist."},
			{LangDef.ZH.getValue(), "客户交易账户不存在"},
			{LangDef.ZHHK.getValue(), "客戶交易賬戶不存在"}}),
	ID_DOCUMENT_HAS_BEEN_OCCUPIED(62001, MessageType.ERROR, new String[][]{
			{LangDef.EN.getValue(), "The ID document has been occupied, such as an legacy client, another AO form"},
			{LangDef.ZH.getValue(), "该身份证件已被占用，例如旧客户、其他 AO 表格"},
			{LangDef.ZHHK.getValue(), "該身分證件已被佔用，例如舊客戶、其他 AO 表格"}}),
	
	// Admin-Portal Setting 62500
	ADMIN_CONFIRM_PASSWORD_NOT_MATCH(62500, MessageType.ERROR, new String[][]{
			{LangDef.EN.getValue(), "Password and confirm password are not match ."},
			{LangDef.ZH.getValue(), "密碼不符"},
			{LangDef.ZHHK.getValue(), "密碼不符"}}),
	
	
	// Admin-Portal client management 63000
	CLIENT_TERMINATION_NOT_EXIST(63000, MessageType.ERROR, new String[][]{
			{LangDef.EN.getValue(), "Client termination request not exist"},
			{LangDef.ZH.getValue(), "客户删除请求不存在"},
			{LangDef.ZHHK.getValue(), "客戶刪除請求不存在"}}),
	CLIENT_TERMINATION_ALREADY_TERMINATED(63001, MessageType.ERROR, new String[][]{
			{LangDef.EN.getValue(), "Client termination request has been completed"},
			{LangDef.ZH.getValue(), "客户删除请求已完成"},
			{LangDef.ZHHK.getValue(), "客戶刪除請求已完成"}}),
	CLIENT_TERMINATION_TRADE_ACC_NOT_TER(63002, MessageType.ERROR, new String[][]{
			{LangDef.EN.getValue(), "Cannot confirm the client termination, please terminate all trade accounts first"},
			{LangDef.ZH.getValue(), "无法确认客户终止，请先终止所有交易账户"},
			{LangDef.ZHHK.getValue(), "無法確認客戶終止，請先終止所有交易賬戶"}}),
	LEGACY_CLIENT_NOT_EXIST(63003, MessageType.ERROR, new String[][]{
			{LangDef.EN.getValue(), "Legacy client not exist"},
			{LangDef.ZH.getValue(), "旧客户不存在"},
			{LangDef.ZHHK.getValue(), "舊客戶不存在"}}),
	LEGACY_CLIENT_ALREADY_MIGRATED(63004, MessageType.ERROR, new String[][]{
			{LangDef.EN.getValue(), "Legacy client already migrated"},
			{LangDef.ZH.getValue(), "旧客户已迁移"},
			{LangDef.ZHHK.getValue(), "舊客戶已遷移"}}),
	LEGACY_CLIENT_CATEGORY_NOT_MATCH(63005, MessageType.ERROR, new String[][]{
			{LangDef.EN.getValue(), "Legacy client category do not match with MMK Ac"},
			{LangDef.ZH.getValue(), "旧客户已迁移"},
			{LangDef.ZHHK.getValue(), "舊客戶已遷移"}}),
	LEGACY_CLIENT_EMAIL_NOT_MATCH(63006, MessageType.ERROR, new String[][]{
			{LangDef.EN.getValue(), "Legacy client email does not match with MMK Ac"},
			{LangDef.ZH.getValue(), "旧客户电子邮件不匹配"},
			{LangDef.ZHHK.getValue(), "舊客戶電子郵件不匹配"}}),
	LEGACY_CLIENT_PHONE_NOT_MATCH(63007, MessageType.ERROR, new String[][]{
			{LangDef.EN.getValue(), "Legacy client phone does not match with MMK Ac"},
			{LangDef.ZH.getValue(), "旧客户电话不匹配"},
			{LangDef.ZHHK.getValue(), "舊客戶電話不匹配"}}),
	LEGACY_CLIENT_ID_DOC_NUM_NOT_MATCH(63008, MessageType.ERROR, new String[][]{
			{LangDef.EN.getValue(), "Legacy client ID document number does not match with the client existing account"},
			{LangDef.ZH.getValue(), "旧客户 ID 文件编号与客户现有帐户不匹配"},
			{LangDef.ZHHK.getValue(), "舊客戶 ID 文件編號與客戶現有帳戶不匹配"}}),
	CLIENT_ALREADY_OPENED_ACCOUNT(63009, MessageType.ERROR, new String[][]{
			{LangDef.EN.getValue(), "Client has opened trade account, not supporting the operations"},
			{LangDef.ZH.getValue(), "客户已开立交易账户，不支持操作"},
			{LangDef.ZHHK.getValue(), "客戶已開立交易帳戶，不支援操作"}}),
	
	// Admin-Portal report 64000 ~ 66000
	REPORT_TEMPLATE_NOT_EXIST(63500, MessageType.ERROR, new String[][]{
			{LangDef.EN.getValue(), "Report template not exist"},
			{LangDef.ZH.getValue(), "报表不存在"},
			{LangDef.ZHHK.getValue(), "報表不存在"}}),
	MISSING_REPORT_DATE(63501, MessageType.ERROR, new String[][]{
			{LangDef.EN.getValue(), "Missing Report Date"},
			{LangDef.ZH.getValue(), "缺少报告日期"},
			{LangDef.ZHHK.getValue(), "缺少報告日期"}}),
	REPORT_DATE_TOO_BIG(63502, MessageType.ERROR, new String[][]{
			{LangDef.EN.getValue(), "Report date range too wide, Report Range Size is 1 Years"},
			{LangDef.ZH.getValue(), "报告日期太大，日期范围大小为1年"},
			{LangDef.ZHHK.getValue(), "報告日期太大，日期範圍大小為1年"}}),
	MISSING_CASH_REPORT_TYPE(63503, MessageType.ERROR, new String[][]{
			{LangDef.EN.getValue(), "Missing cash report type"},
			{LangDef.ZH.getValue(), "缺少现金报告类型"},
			{LangDef.ZHHK.getValue(), "缺少現金報告類型"}}),
	MISSING_SOCIAL_ID(63504, MessageType.ERROR, new String[][]{
			{LangDef.EN.getValue(), "Missing Social ID"},
			{LangDef.ZH.getValue(), "缺少 Social ID"},
			{LangDef.ZHHK.getValue(), "缺少 Social ID"}}),
	REPORT_FILE_TYPE_NOT_EXIST(63505, MessageType.ERROR, new String[][]{
			{LangDef.EN.getValue(), "Missing file type"},
			{LangDef.ZH.getValue(), "缺少文件类型"},
			{LangDef.ZHHK.getValue(), "缺少文件類型"}}),
	REPORT_START_END_DATE_NOT_CORRECT(63506, MessageType.ERROR, new String[][]{
			{LangDef.EN.getValue(), "Report start or end dates not correct. Please checking start date should be earlier than end date."},
			{LangDef.ZH.getValue(), "报告开始或结束日期不正确。 请检查开始日期是否早于结束日期。"},
			{LangDef.ZHHK.getValue(), "報告開始或結束日期不正確。 請檢查開始日期是否早於結束日期。"}}),
	REPORT_START_DATE_IS_FUTURE_DATE(63507, MessageType.ERROR, new String[][]{
			{LangDef.EN.getValue(), "Report start date should be eariler than today."},
			{LangDef.ZH.getValue(), "报告开始日期不能大于今天。"},
			{LangDef.ZHHK.getValue(), "報告開始日期不能大於今天。"}}),
	REPORT_END_DATE_IS_FUTURE_DATE(63508, MessageType.ERROR, new String[][]{
			{LangDef.EN.getValue(), "Report end date should be eariler than today."},
			{LangDef.ZH.getValue(), "报告结束日期不能大于今天。"},
			{LangDef.ZHHK.getValue(), "報告結束日期不能大於今天。"}}),
	REPORT_TRADE_ACC_RANGE_MISSING(63509, MessageType.ERROR, new String[][]{
			{LangDef.EN.getValue(), "Report 'from acc no' and 'to acc no range' is missing."},
			{LangDef.ZH.getValue(), "缺少交易账户最大值/最少值范围"},
			{LangDef.ZHHK.getValue(), "缺少交易賬戶最大值/最少值範圍"}}),
	REPORT_TRADE_ACC_RANGE_NOT_CORRECT(63510, MessageType.ERROR, new String[][]{
			{LangDef.EN.getValue(), "'From acc no' and 'To acc no' range indicates an error when a value is not in the range. Please checking 'From acc no' should be less than 'To acc no'."},
			{LangDef.ZH.getValue(), "缺少交易账户最大值/最少值范围。请检查'From acc no'少应小于'To acc no'。"},
			{LangDef.ZHHK.getValue(), "缺少交易賬戶最大值/最少值範圍。請檢查'From acc no'少應小於'To acc no'。"}}),
	REPORT_SUPPORT_TRADE_ACC_RANGE_MODE(63511, MessageType.ERROR, new String[][]{
			{LangDef.EN.getValue(), "This report can not support Client ID search."},
			{LangDef.ZH.getValue(), "本报告仅支持交易账户范围"},
			{LangDef.ZHHK.getValue(), "此報告僅支援交易賬戶範圍"}}),
	REPORT_TRADE_ACC_MODE_NOT_SUPPORT(63512, MessageType.ERROR, new String[][]{
			{LangDef.EN.getValue(), "This report can not support From / To acc no range search."},
			{LangDef.ZH.getValue(), "本报告仅支持交易账户ID找尋"},
			{LangDef.ZHHK.getValue(), "此報告僅支援交易賬戶ID找尋"}}),
	ATTACHMENT_DOWNLOAD_DATE_TOO_BIG(63513, MessageType.ERROR, new String[][]{
		{LangDef.EN.getValue(), "Attachment download report date range too wide, Report Range Size is 1 Day"},
		{LangDef.ZH.getValue(), "附件下载报告日期太大，日期范围大小为1天"},
		{LangDef.ZHHK.getValue(), "附件下載報告日期太大，日期範圍大小為1天"}}),
	;
	
	public static int ADMIN_MESSAGE_START_FROM = 60000;
	private int code;
	private MessageType type;
	private HashMap<String, String> langText = new HashMap<String, String>();
	private void validateText() throws Exception {
		for(String text: langText.values()) {
			if(text.contains("|"))
				throw new Exception("Message can't contain '|': " + text);

		}
	}

	AdminMessage(int code, MessageType type, String[][] langTexts) {
		this.code = code;
		this.type = type;
		for(String[] pair: langTexts) {
			langText.put(pair[0], pair[1]);
		}
	}

	public int getCode() {
		return this.code;
	}
	
	public String getText(String lang) {
		return langText.get(lang);
	}
	
	public String getText() {
		return langText.get(SystemDefault.getLanguage());
	}
	
	public Map<String, String> getLangText() {
		return langText;
	}
	
	public String toString(String lang) {
		String txt = langText.get(lang);
		return "" + this.code + "|" + this.type + "|" + txt; 
	}

	@Override
	public String toString() {
		return toString(SystemDefault.getLanguage());
	}
	
	// static
	
	static private HashMap<Integer, AdminMessage> map = new  HashMap<Integer, AdminMessage>();
	
	static private String getKey(int code, String lang) {
		return "" + code + "-" + lang;
	}
	
	static private void addMessage(AdminMessage message, String lang, String text) throws Exception {
	}
	
	static public AdminMessage get(int code) {
		return map.get(code);
	}
	
	static public void validate() throws Exception {
		for(AdminMessage msg: AdminMessage.values()) {
			if (map.containsKey(msg.getCode())) {
				throw new Exception("AdminMessage code already exists: " + msg.getCode());
			}
			msg.validateText();
			map.put(new Integer(msg.getCode()), msg);
		}
		
	}
	
	public static void main(String args[]) throws Exception {
	}
}
