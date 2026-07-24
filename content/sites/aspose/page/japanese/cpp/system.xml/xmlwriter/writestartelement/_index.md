---
title: "System::Xml::XmlWriter::WriteStartElement メソッド"
linktitle: "WriteStartElement"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlWriter::WriteStartElement メソッド。派生クラスでオーバーライドされた場合、指定されたローカル名で開始タグを書き出します（C++）。"
type: docs
weight: 3200
url: /ja/cpp/system.xml/xmlwriter/writestartelement/
---
## XmlWriter::WriteStartElement(const String\&) method


派生クラスでオーバーライドされた場合、指定されたローカル名の開始タグを書き出します。

```cpp
void System::Xml::XmlWriter::WriteStartElement(const String &localName)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| localName | const String\& | 要素のローカル名です。 |

## 参照

* Class [String](../../../system/string/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlWriter::WriteStartElement(const String\&, const String\&) method


派生クラスでオーバーライドされた場合、指定された開始タグを書き込み、指定された名前空間に関連付けます。

```cpp
void System::Xml::XmlWriter::WriteStartElement(const String &localName, const String &ns)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| localName | const String\& | 要素のローカル名です。 |
| ns | const String\& | 要素に関連付ける名前空間 URI。すでにスコープ内にあり、関連付けられたプレフィックスが存在する場合、ライターは自動的にそのプレフィックスも書き込みます。 |

## 参照

* Class [String](../../../system/string/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlWriter::WriteStartElement(const String\&, const String\&, const String\&) method


派生クラスでオーバーライドされた場合、指定された開始タグを書き込み、指定された名前空間とプレフィックスに関連付けます。

```cpp
virtual void System::Xml::XmlWriter::WriteStartElement(const String &prefix, const String &localName, const String &ns)=0
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| prefix | const String\& | 要素の名前空間プレフィックスです。 |
| localName | const String\& | 要素のローカル名です。 |
| ns | const String\& | 要素に関連付ける名前空間 URI。 |

## 参照

* Class [String](../../../system/string/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
