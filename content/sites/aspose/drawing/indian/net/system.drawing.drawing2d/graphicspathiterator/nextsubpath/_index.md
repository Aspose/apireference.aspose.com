---
title: GraphicsPathIterator.NextSubpath
second_title: .NET API संदर्भ के लिए Aspose.Drawing
description: GraphicsPathIterator तरक. चलत हैGraphicsPathIterator पथ में अगले उपपथ के लए अगले उपपथ क प्ररंभ अनुक्रमणक और अंत अनुक्रमणक आउट पैरमटर में समहत हैं
type: docs
weight: 100
url: /hi/net/system.drawing.drawing2d/graphicspathiterator/nextsubpath/
---
## NextSubpath(out int, out int, out bool) {#nextsubpath}

चलता है[`GraphicsPathIterator`](../) पथ में अगले उपपथ के लिए। अगले उपपथ का प्रारंभ अनुक्रमणिका और अंत अनुक्रमणिका [आउट] पैरामीटर में समाहित हैं।

```csharp
public int NextSubpath(out int startIndex, out int endIndex, out bool isClosed)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| startIndex | Int32& | [बाहर] अगले उपपथ का प्रारंभिक सूचकांक प्राप्त करता है। |
| endIndex | Int32& | [बाहर] अगले उपपथ का अंतिम सूचकांक प्राप्त करता है। |
| isClosed | Boolean& | [बाहर] इंगित करता है कि उपपथ बंद है या नहीं। |

### प्रतिलाभ की मात्रा

पुनर्प्राप्त आकृति (उपपथ) में डेटा बिंदुओं की संख्या। यदि पुनर्प्राप्त करने के लिए कोई और आंकड़े नहीं हैं, तो शून्य लौटाया जाता है।

### यह सभी देखें

* class [GraphicsPathIterator](../)
* नाम स्थान [System.Drawing.Drawing2D](../../graphicspathiterator/)
* सभा [Aspose.Drawing](../../../)

---

## NextSubpath(GraphicsPath, out bool) {#nextsubpath_1}

इसके संबंधित पथ से अगला आंकड़ा (उपपथ) प्राप्त करता है[`GraphicsPathIterator`](../) .

```csharp
public int NextSubpath(GraphicsPath path, out bool isClosed)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| path | GraphicsPath | ए[`GraphicsPath`](../../graphicspath/) यानी इसके डेटा बिंदुओं को इस पुनरावर्तक के लिए पुनर्प्राप्त आकृति (सबपाथ) के डेटा बिंदुओं से मिलान करने के लिए सेट करना है। |
| isClosed | Boolean& | [बाहर] इंगित करता है कि वर्तमान उपपथ बंद है या नहीं। यदि आकृति बंद है तो यह सत्य है, अन्यथा यह असत्य है। |

### प्रतिलाभ की मात्रा

पुनर्प्राप्त आकृति (उपपथ) में डेटा बिंदुओं की संख्या। यदि पुनर्प्राप्त करने के लिए कोई और आंकड़े नहीं हैं, तो शून्य लौटाया जाता है।

### यह सभी देखें

* class [GraphicsPath](../../graphicspath/)
* class [GraphicsPathIterator](../)
* नाम स्थान [System.Drawing.Drawing2D](../../graphicspathiterator/)
* सभा [Aspose.Drawing](../../../)


