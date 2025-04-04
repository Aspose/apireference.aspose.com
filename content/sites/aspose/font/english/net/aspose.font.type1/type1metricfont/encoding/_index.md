---
title: Type1MetricFont.Encoding
second_title: Aspose.Font for .NET API Reference
description: Type1MetricFont property. Encoding is defined in metrics file. StandardAdobeEncoding the encoding is populated automatically
type: docs
weight: 10
url: /net/aspose.font.type1/type1metricfont/encoding/
---
## Type1MetricFont.Encoding property

Encoding is defined in metrics file. StandardAdobeEncoding: the encoding is populated automatically

```csharp
public override IFontEncoding Encoding { get; }
```

## Examples

FontSpecific: user should provide the specific encoding with following way:

```csharp
string[] zapfDingbatsEncoding = new string[256] {null, null, ... , "space", "a1", ...};
FontEnvironment.Current.FontSpecificEncodings.RegisterEncoding("ZapfDingbats", zapfDingbatsEncoding);
```

System::ArrayPtr&lt;System::String&gt; zapfDingbatsEncoding = System::MakeArray&lt;System::String&gt;({nullptr, nullptr, ..., u"space", u"a1", ...}); FontEnvironment::get_Current()-&gt;get_FontSpecificEncodings()-&gt;RegisterEncoding(u"ZapfDingbats", zapfDingbatsEncoding);

### See Also

* interface [IFontEncoding](../../../aspose.font/ifontencoding/)
* class [Type1MetricFont](../)
* namespace [Aspose.Font.Type1](../../../aspose.font.type1/)
* assembly [Aspose.Font](../../../)


