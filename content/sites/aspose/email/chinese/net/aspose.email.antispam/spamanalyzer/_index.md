---
title: SpamAnalyzer
second_title: Aspose.Email for .NET API 参考
description: 允许应用程序使用自学习贝叶斯过滤器检测垃圾邮件的类
type: docs
weight: 250
url: /zh/net/aspose.email.antispam/spamanalyzer/
---
## SpamAnalyzer class

允许应用程序使用自学习贝叶斯过滤器检测垃圾邮件的类。

```csharp
public class SpamAnalyzer
```

## 构造函数

| 姓名 | 描述 |
| --- | --- |
| [SpamAnalyzer](spamanalyzer#constructor)() | 初始化一个新的实例[`SpamAnalyzer`](../spamanalyzer)类. |
| [SpamAnalyzer](spamanalyzer#constructor_1)(Stream) | 初始化一个新的实例[`SpamAnalyzer`](../spamanalyzer)类. |
| [SpamAnalyzer](spamanalyzer#constructor_2)(string) | 初始化一个新的实例[`SpamAnalyzer`](../spamanalyzer)类. |

## 方法

| 姓名 | 描述 |
| --- | --- |
| [LoadDatabase](../../aspose.email.antispam/spamanalyzer/loaddatabase#loaddatabase)(Stream) | 从流中加载贝叶斯数据库。 |
| [LoadDatabase](../../aspose.email.antispam/spamanalyzer/loaddatabase#loaddatabase_1)(string) | 从文件加载贝叶斯数据库。 |
| [Reset](../../aspose.email.antispam/spamanalyzer/reset)() | 清除所有统计信息（贝叶斯数据库）。 |
| [SaveDatabase](../../aspose.email.antispam/spamanalyzer/savedatabase#savedatabase)(Stream) | 将贝叶斯数据库保存到流中。 |
| [SaveDatabase](../../aspose.email.antispam/spamanalyzer/savedatabase#savedatabase_1)(string) | 将贝叶斯数据库保存到文件中。 |
| [Test](../../aspose.email.antispam/spamanalyzer/test)(MailMessage) | 分析邮件并返回邮件为垃圾邮件的概率。 |
| [TrainFilter](../../aspose.email.antispam/spamanalyzer/trainfilter#trainfilter)(MailMessage, bool) | 从指定的邮件中学习来自垃圾邮件或非垃圾邮件来源。 |
| [TrainFilter](../../aspose.email.antispam/spamanalyzer/trainfilter#trainfilter_1)(MailMessage[], MailMessage[]) | 从指定的邮件中学习来自垃圾邮件或非垃圾邮件来源。 |
| [TrainFilter](../../aspose.email.antispam/spamanalyzer/trainfilter#trainfilter_2)(string, bool) | 从指定的字符串中学习来自垃圾邮件或非垃圾邮件来源。 |

### 也可以看看

* 命名空间 [Aspose.Email.AntiSpam](../../aspose.email.antispam)
* 部件 [Aspose.Email](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Email.dll -->
