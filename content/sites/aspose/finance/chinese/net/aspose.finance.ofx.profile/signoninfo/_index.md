---
title: SignonInfo
second_title: Aspose.Finance 适用于 .NET API 参考
description: 登录信息类。
type: docs
weight: 4790
url: /zh/net/aspose.finance.ofx.profile/signoninfo/
---
## SignonInfo class

登录信息类。

```csharp
public class SignonInfo
```

## 构造函数

| 名称 | 描述 |
| --- | --- |
| [SignonInfo](signoninfo)() | 初始化 [`SignonInfo`](../signoninfo) 类的新实例。 |

## 属性

| 名称 | 描述 |
| --- | --- |
| [AccessTokenRequire](../../aspose.finance.ofx.profile/signoninfo/accesstokenrequire) { get; set; } | 获取或设置服务器是否要求所有请求（除 profile 外）都提供 ACCESSTOKEN。 |
| [AuthTokenFirst](../../aspose.finance.ofx.profile/signoninfo/authtokenfirst) { get; set; } | 获取或设置服务器是否要求客户端在首次登录时发送 AUTHTOKEN。 |
| [AuthTokenInfoUrl](../../aspose.finance.ofx.profile/signoninfo/authtokeninfourl) { get; set; } | 获取或设置由运营 OFX 服务器的机构提供 AUTHTOKEN 信息的 URL。 |
| [AuthTokenLabel](../../aspose.finance.ofx.profile/signoninfo/authtokenlabel) { get; set; } | 获取或设置 AUTHTOKEN 的文本标签。 |
| [CaseSensitive](../../aspose.finance.ofx.profile/signoninfo/casesensitive) { get; set; } | 获取或设置密码是否区分大小写。 |
| [ChangePinFirst](../../aspose.finance.ofx.profile/signoninfo/changepinfirst) { get; set; } | 获取或设置服务器是否要求客户端在首次登录时更改用户密码。 |
| [CharType](../../aspose.finance.ofx.profile/signoninfo/chartype) { get; set; } | 获取或设置密码允许的字符类型。 |
| [ClientuidRequire](../../aspose.finance.ofx.profile/signoninfo/clientuidrequire) { get; set; } | 获取或设置是否需要 CLIENTUID。 |
| [Max](../../aspose.finance.ofx.profile/signoninfo/max) { get; set; } | 获取或设置密码的最大字符数。 |
| [MFAChallengeFirst](../../aspose.finance.ofx.profile/signoninfo/mfachallengefirst) { get; set; } | 获取或设置客户端是否必须在首次登录时（在发送任何其他请求之前）发送 MFACHALLENGERQ。 |
| [MFAChallengeSupport](../../aspose.finance.ofx.profile/signoninfo/mfachallengesupport) { get; set; } | 获取或设置服务器是否支持 MFACHALLENGE 功能。 |
| [Min](../../aspose.finance.ofx.profile/signoninfo/min) { get; set; } | 获取或设置密码的最小字符数。 |
| [Pinch](../../aspose.finance.ofx.profile/signoninfo/pinch) { get; set; } | 获取或设置服务器是否支持 PIN 更改请求。 |
| [SignonRealm](../../aspose.finance.ofx.profile/signoninfo/signonrealm) { get; set; } | 获取或设置标识此域的标识符。 |
| [Spaces](../../aspose.finance.ofx.profile/signoninfo/spaces) { get; set; } | 获取或设置是否允许在这些字符之外使用空格。 |
| [Special](../../aspose.finance.ofx.profile/signoninfo/special) { get; set; } | 获取或设置是否允许在这些字符之外使用特殊字符。 |
| [UserCredential1Label](../../aspose.finance.ofx.profile/signoninfo/usercredential1label) { get; set; } | 获取或设置用户凭证的文本提示。如果存在，则除了 USERID 和 USERPASS 外，还需要第三个凭证 (USERCRED1)。 |
| [UserCredential2Label](../../aspose.finance.ofx.profile/signoninfo/usercredential2label) { get; set; } | 获取或设置用户凭证的文本提示。如果存在，则除了 USERID、USERPASS 和 USERCRED1 外，还需要第四个凭证 (USERCRED2)。如果出现，还必须提供 UserCredential1Label。 |

### 另请参阅

* namespace [Aspose.Finance.Ofx.Profile](../../aspose.finance.ofx.profile)
* assembly [Aspose.Finance](../../)

<!-- 请勿编辑：由 xmldocmd 为 Aspose.Finance.dll 生成 -->
