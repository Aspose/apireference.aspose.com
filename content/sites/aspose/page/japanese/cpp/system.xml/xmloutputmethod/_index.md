---
title: "System::Xml::XmlOutputMethod 列挙体"
linktitle: "XmlOutputMethod"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlOutputMethod 列挙体。C++ で XmlWriter の出力をシリアライズするために使用される方法を指定します。"
type: docs
weight: 6300
url: /ja/cpp/system.xml/xmloutputmethod/
---
## XmlOutputMethod enum


[XmlWriter](../xmlwriter/) の出力をシリアライズするために使用される方法を指定します。

```cpp
enum class XmlOutputMethod
```

### 値

| 名前 | 値 | 説明 |
| --- | --- | --- |
| Xml | 0 | XML 1.0 の規則に従ってシリアライズします。 |
| Html | 1 | XSLT が指定する HTML の規則に従ってシリアライズします。 |
| Text | 2 | テキストブロックのみをシリアライズします。 |
| AutoDetect | 3 | 実行時に XSLT の規則を使用して、[XmlOutputMethod::Xml](./) と [XmlOutputMethod::Html](./) の出力方法の間で選択します。 |

## 参照

* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
