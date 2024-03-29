---
title: InboxRule
second_title: Aspose.Email for .NET API 参考
description: 表示收件箱规则
type: docs
weight: 3510
url: /zh/net/aspose.email.clients.exchange/inboxrule/
---
## InboxRule class

表示收件箱规则

```csharp
public sealed class InboxRule
```

## 构造函数

| 姓名 | 描述 |
| --- | --- |
| [InboxRule](inboxrule)() | 初始化[`InboxRule`](../inboxrule) class |

## 特性

| 姓名 | 描述 |
| --- | --- |
| [Actions](../../aspose.email.clients.exchange/inboxrule/actions) { get; set; } | 获取或设置条件满足时对消息采取的操作。 |
| [Conditions](../../aspose.email.clients.exchange/inboxrule/conditions) { get; set; } | 获取或设置条件，当满足时，将触发该规则的规则操作。 |
| [DisplayName](../../aspose.email.clients.exchange/inboxrule/displayname) { get; set; } | 获取或设置规则的显示名称。 |
| [Exceptions](../../aspose.email.clients.exchange/inboxrule/exceptions) { get; set; } | 获取或设置表示收件箱规则的所有可用规则异常条件的异常。 |
| [IsEnabled](../../aspose.email.clients.exchange/inboxrule/isenabled) { get; set; } | 获取或设置一个值，指示是否启用规则。 |
| [IsInError](../../aspose.email.clients.exchange/inboxrule/isinerror) { get; } | 获取指示规则是否处于错误状态的值。 |
| [IsNotSupported](../../aspose.email.clients.exchange/inboxrule/isnotsupported) { get; } | 获取一个值，该值指示是否不能使用托管代码 API 修改规则。 |
| [IsReadOnly](../../aspose.email.clients.exchange/inboxrule/isreadonly) { get; set; } | 获取或设置规则是否为只读的值。 |
| [Priority](../../aspose.email.clients.exchange/inboxrule/priority) { get; set; } | 获取或设置一个值，该值指示规则运行的顺序。 |
| [RuleId](../../aspose.email.clients.exchange/inboxrule/ruleid) { get; set; } | 获取或设置规则标识符。 |

## 方法

| 姓名 | 描述 |
| --- | --- |
| static [CreateRuleDeleteContaining](../../aspose.email.clients.exchange/inboxrule/createruledeletecontaining)(string[]) | 创建收件箱规则，删除正文或主题中包含指定字符串的邮件 |
| static [CreateRuleDeleteFrom](../../aspose.email.clients.exchange/inboxrule/createruledeletefrom)(MailAddress) | 创建从指定发件人中删除邮件的收件箱规则 |
| static [CreateRuleMoveContaining](../../aspose.email.clients.exchange/inboxrule/createrulemovecontaining)(string[], string) | 创建收件箱规则，将正文或主题中包含指定字符串的邮件移动到指定文件夹 |
| static [CreateRuleMoveFrom](../../aspose.email.clients.exchange/inboxrule/createrulemovefrom)(MailAddress, string) | 创建将邮件从指定发件人移至指定文件夹的收件箱规则 |

### 也可以看看

* 命名空间 [Aspose.Email.Clients.Exchange](../../aspose.email.clients.exchange)
* 部件 [Aspose.Email](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Email.dll -->
