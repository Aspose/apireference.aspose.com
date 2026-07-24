---
title: "System::Xml::DtdProcessing enum"
linktitle: "DtdProcessing"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::DtdProcessing 列挙体。DTD の処理オプションを指定します。DtdProcessing 列挙体は C++ の XmlReaderSettings クラスで使用されます。"
type: docs
weight: 4700
url: /ja/cpp/system.xml/dtdprocessing/
---
## DtdProcessing enum


DTD の処理オプションを指定します。 [DtdProcessing](./) 列挙体は [XmlReaderSettings](../xmlreadersettings/) クラスで使用されます。

```cpp
enum class DtdProcessing
```

### 値

| 名前 | 値 | 説明 |
| --- | --- | --- |
| Prohibit | 0 | DTD が検出されたときに、[XmlException](../xmlexception/) がスローされ、DTD が禁止されている旨のメッセージが表示されます。これはデフォルトの動作です。 |
| Ignore | 1 | DOCTYPE 要素が無視されます。DTD の処理は行われず、出力時に DTD/DOCTYPE は失われます。 |
| Parse | 2 | DTD の解析に使用されます。 |

## 参照

* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
