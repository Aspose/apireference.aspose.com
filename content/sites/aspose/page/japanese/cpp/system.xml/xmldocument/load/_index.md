---
title: "System::Xml::XmlDocument::Load メソッド"
linktitle: "ロード"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlDocument::Load メソッド。C++ で指定されたストリームから XML ドキュメントをロードします。"
type: docs
weight: 3400
url: /ja/cpp/system.xml/xmldocument/load/
---
## XmlDocument::Load(SharedPtr\<IO::Stream\>) method


指定されたストリームからXMLドキュメントをロードします。

```cpp
virtual void System::Xml::XmlDocument::Load(SharedPtr<IO::Stream> inStream)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| inStream | SharedPtr\<IO::Stream\> | ロードする XML ドキュメントを含むストリームです。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlDocument::Load(SharedPtr\<IO::TextReader\>) method


指定されたTextReaderからXMLドキュメントをロードします。

```cpp
virtual void System::Xml::XmlDocument::Load(SharedPtr<IO::TextReader> txtReader)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| txtReader | SharedPtr\<IO::TextReader\> | ドキュメントに XML データを供給するために使用される TextReader です。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlDocument::Load(SharedPtr\<XmlReader\>) method


指定された [XmlReader](../../xmlreader/) から XML ドキュメントをロードします。

```cpp
virtual void System::Xml::XmlDocument::Load(SharedPtr<XmlReader> reader)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| reader | SharedPtr\<XmlReader\> | ドキュメントに XML データを供給するために使用される [XmlReader](../../xmlreader/) です。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../xmlreader/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlDocument::Load(String) method


指定されたURLからXMLドキュメントをロードします。

```cpp
virtual void System::Xml::XmlDocument::Load(String filename)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| filename | String | ロードする XML ドキュメントを含むファイルの URL。URL はローカルファイルまたは HTTP URL（[Web](../../../system.web/) アドレス）のいずれかにできます。 |

## 参照

* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
