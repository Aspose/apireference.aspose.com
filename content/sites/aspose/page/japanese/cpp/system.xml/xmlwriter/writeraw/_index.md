---
title: "System::Xml::XmlWriter::WriteRaw method"
linktitle: "WriteRaw"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlWriter::WriteRaw method. 派生クラスでオーバーライドされた場合、C++ で文字バッファから生のマークアップを手動で書き込みます。"
type: docs
weight: 2900
url: /ja/cpp/system.xml/xmlwriter/writeraw/
---
## XmlWriter::WriteRaw(ArrayPtr\<char16_t\>, int32_t, int32_t) method


派生クラスでオーバーライドされた場合、文字バッファから生のマークアップを手動で書き出します。

```cpp
virtual void System::Xml::XmlWriter::WriteRaw(ArrayPtr<char16_t> buffer, int32_t index, int32_t count)=0
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | ArrayPtr\<char16_t\> | 書き込むテキストを含む文字配列です。 |
| インデックス | int32_t | 書き込むテキストの開始位置を示すバッファ内の位置。 |
| count | int32_t | 書き込む文字数です。 |

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlWriter::WriteRaw(const String\&) method


派生クラスでオーバーライドされた場合、文字列から生のマークアップを手動で書き出します。

```cpp
virtual void System::Xml::XmlWriter::WriteRaw(const String &data)=0
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| data | const String\& | [String](../../../system/string/) 書き込むテキストを含む。 |

## 参照

* Class [String](../../../system/string/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
