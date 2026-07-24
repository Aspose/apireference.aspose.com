---
title: "System::Xml::XmlDocument::CreateDocumentType メソッド"
linktitle: "CreateDocumentType"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlDocument::CreateDocumentType メソッド。C++ で新しい XmlDocumentType オブジェクトを返します。"
type: docs
weight: 700
url: /ja/cpp/system.xml/xmldocument/createdocumenttype/
---
## XmlDocument::CreateDocumentType method


新しい [XmlDocumentType](../../xmldocumenttype/) オブジェクトを返します。

```cpp
virtual SharedPtr<XmlDocumentType> System::Xml::XmlDocument::CreateDocumentType(const String &name, const String &publicId, const String &systemId, const String &internalSubset)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| name | const String\& | ドキュメントタイプの名前。 |
| publicId | const String\& | ドキュメントタイプのパブリック識別子、または **nullptr**。外部 DTD サブセットの場所を特定するために、パブリック URI とシステム識別子の両方を指定できます。 |
| systemId | const String\& | ドキュメントタイプのシステム識別子、または **nullptr**。外部 DTD サブセットのファイル位置の URL を指定します。 |
| internalSubset | const String\& | ドキュメントタイプの DTD 内部サブセット、または **nullptr**。 |

### ReturnValue

新しい [XmlDocumentType](../../xmldocumenttype/)。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlDocumentType](../../xmldocumenttype/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
