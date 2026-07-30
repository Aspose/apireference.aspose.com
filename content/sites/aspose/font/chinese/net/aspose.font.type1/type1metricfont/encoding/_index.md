---
title: "Type1MetricFont.Encoding"
second_title: "Aspose.Font for .NET API 参考"
description: "Type1MetricFont 属性。编码在度量文件中定义。StandardAdobeEncoding 编码会自动填充"
type: docs
weight: 10
url: /zh/net/aspose.font.type1/type1metricfont/encoding/
---
## Type1MetricFont.Encoding property

编码在度量文件中定义。StandardAdobeEncoding：该编码会自动填充。

```csharp
public override IFontEncoding Encoding { get; }
```

## 示例

FontSpecific：用户应按以下方式提供特定编码：

```csharp
string[] zapfDingbatsEncoding = new string[256] {null, null, ... , "space", "a1", ...};
FontEnvironment.Current.FontSpecificEncodings.RegisterEncoding("ZapfDingbats", zapfDingbatsEncoding);
```

System::ArrayPtr&lt;System::String&gt; zapfDingbatsEncoding = System::MakeArray&lt;System::String&gt;({nullptr, nullptr, ..., u\"space\", u\"a1\", ...}); FontEnvironment::get_Current()-&gt;get_FontSpecificEncodings()-&gt;RegisterEncoding(u\"ZapfDingbats\", zapfDingbatsEncoding);

### 另见

* interface [IFontEncoding](../../../aspose.font/ifontencoding/)
* class [Type1MetricFont](../)
* namespace [Aspose.Font.Type1](../../../aspose.font.type1/)
* assembly [Aspose.Font](../../../)


