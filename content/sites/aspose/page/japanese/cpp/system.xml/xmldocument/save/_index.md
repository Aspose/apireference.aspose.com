---
title: "System::Xml::XmlDocument::Save メソッド"
linktitle: "保存"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlDocument::Save メソッド。C++ で指定されたストリームに XML ドキュメントを保存します。"
type: docs
weight: 3700
url: /ja/cpp/system.xml/xmldocument/save/
---
## XmlDocument::Save(SharedPtr\<IO::Stream\>) method


XMLドキュメントを指定されたストリームに保存します。

```cpp
virtual void System::Xml::XmlDocument::Save(SharedPtr<IO::Stream> outStream)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| outStream | SharedPtr\<IO::Stream\> | 保存先のストリームです。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlDocument::Save(SharedPtr\<IO::TextWriter\>) method


XMLドキュメントを指定されたTextWriterに保存します。

```cpp
virtual void System::Xml::XmlDocument::Save(SharedPtr<IO::TextWriter> writer)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| writer | SharedPtr\<IO::TextWriter\> | 保存先の TextWriter です。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlDocument::Save(SharedPtr\<XmlWriter\>) method


指定された [XmlWriter](../../xmlwriter/) に XML ドキュメントを保存します。

```cpp
virtual void System::Xml::XmlDocument::Save(SharedPtr<XmlWriter> w)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| w | SharedPtr\<XmlWriter\> | 保存先の [XmlWriter](../../xmlwriter/)。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../../xmlwriter/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlDocument::Save(String) method


XMLドキュメントを指定されたファイルに保存します。指定されたファイルが存在する場合、このメソッドは上書きします。

```cpp
virtual void System::Xml::XmlDocument::Save(String filename)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| filename | String | ドキュメントを保存したいファイルの場所。 |

## 参照

* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
