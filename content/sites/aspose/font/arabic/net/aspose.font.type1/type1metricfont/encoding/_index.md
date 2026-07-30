---
title: "Type1MetricFont.Encoding"
second_title: "مرجع API لـ Aspose.Font لـ .NET"
description: "خاصية Type1MetricFont. الترميز مُعرف في ملف القياسات. StandardAdobeEncoding يتم تعبئة الترميز تلقائيًا"
type: docs
weight: 10
url: /ar/net/aspose.font.type1/type1metricfont/encoding/
---
## Type1MetricFont.Encoding property

يتم تعريف الترميز في ملف المقاييس. StandardAdobeEncoding: يتم ملء الترميز تلقائيًا.

```csharp
public override IFontEncoding Encoding { get; }
```

## أمثلة

محدد الخط: يجب على المستخدم توفير الترميز المحدد بالطريقة التالية:

```csharp
string[] zapfDingbatsEncoding = new string[256] {null, null, ... , "space", "a1", ...};
FontEnvironment.Current.FontSpecificEncodings.RegisterEncoding("ZapfDingbats", zapfDingbatsEncoding);
```

System::ArrayPtr&lt;System::String&gt; zapfDingbatsEncoding = System::MakeArray&lt;System::String&gt;({nullptr, nullptr, ..., u"space", u"a1", ...}); FontEnvironment::get_Current()-&gt;get_FontSpecificEncodings()-&gt;RegisterEncoding(u"ZapfDingbats", zapfDingbatsEncoding);

### انظر أيضاً

* interface [IFontEncoding](../../../aspose.font/ifontencoding/)
* class [Type1MetricFont](../)
* namespace [Aspose.Font.Type1](../../../aspose.font.type1/)
* assembly [Aspose.Font](../../../)


