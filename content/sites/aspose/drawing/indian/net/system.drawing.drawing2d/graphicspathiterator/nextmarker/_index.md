---
title: GraphicsPathIterator.NextMarker
second_title: .NET API संदर्भ के लिए Aspose.Drawing
description: GraphicsPathIterator तरक. बढ़त हैGraphicsPathIteratorपथ में अगले मर्कर के लए और आउट पैरमटर के मध्यम से इंडेक्स प्ररंभ करें और इंडेक्स क रकें
type: docs
weight: 80
url: /hi/net/system.drawing.drawing2d/graphicspathiterator/nextmarker/
---
## NextMarker(out int, out int) {#nextmarker}

बढ़ाता है[`GraphicsPathIterator`](../)पथ में अगले मार्कर के लिए और [आउट] पैरामीटर के माध्यम से इंडेक्स प्रारंभ करें और इंडेक्स को रोकें।

```csharp
public int NextMarker(out int startIndex, out int endIndex)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| startIndex | Int32& | [बाहर] इस पैरामीटर को दिया गया पूर्णांक संदर्भ उस बिंदु का सूचकांक प्राप्त करता है जो उपपथ शुरू करता है। |
| endIndex | Int32& | [बाहर] इस पैरामीटर को प्रदान किया गया पूर्णांक संदर्भ उस बिंदु का सूचकांक प्राप्त करता है जो उपपथ को समाप्त करता है जिससे स्टार्टइंडेक्स इंगित करता है। |

### प्रतिलाभ की मात्रा

इस मार्कर और अगले के बीच अंकों की संख्या।

### यह सभी देखें

* class [GraphicsPathIterator](../)
* नाम स्थान [System.Drawing.Drawing2D](../../graphicspathiterator/)
* सभा [Aspose.Drawing](../../../)

---

## NextMarker(GraphicsPath) {#nextmarker_1}

यह[`GraphicsPathIterator`](../) वस्तु में एक है[`GraphicsPath`](../../graphicspath/) इससे जुड़ी वस्तु। यह विधि संबद्ध को बढ़ाती है[`GraphicsPath`](../../graphicspath/) अपने पथ में अगले मार्कर पर और वर्तमान मार्कर और अगले मार्कर (या पथ के अंत) के बीच निहित सभी बिंदुओं को एक सेकंड में कॉपी करता है[`GraphicsPath`](../../graphicspath/) ऑब्जेक्ट पैरामीटर में पारित किया गया।

```csharp
public int NextMarker(GraphicsPath path)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| path | GraphicsPath | [`GraphicsPath`](../../graphicspath/) वह वस्तु जिस पर बिंदुओं की प्रतिलिपि बनाई जाएगी। |

### प्रतिलाभ की मात्रा

इस मार्कर और अगले के बीच अंकों की संख्या।

### यह सभी देखें

* class [GraphicsPath](../../graphicspath/)
* class [GraphicsPathIterator](../)
* नाम स्थान [System.Drawing.Drawing2D](../../graphicspathiterator/)
* सभा [Aspose.Drawing](../../../)


