---
title: "System::Xml::XmlNode::get_ParentNode metodu"
linktitle: "get_ParentNode"
second_title: "Aspose.Page için C++"
description: "System::Xml::XmlNode::get_ParentNode metodu. Bu düğümün ebeveynini (ebeveyni olabilen düğümler için) C++'ta döndürür."
type: docs
weight: 2100
url: /tr/cpp/system.xml/xmlnode/get_parentnode/
---
## XmlNode::get_ParentNode method


Bu düğümün ebeveynini döndürür (ebeveyni olabilen düğümler için).

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNode::get_ParentNode() final
```


### ReturnValue

Mevcut düğümün ebeveyni olan [XmlNode](../).
## Açıklamalar



Bir düğüm yeni oluşturulmuş ve henüz ağaca eklenmemişse veya ağaçtan kaldırılmışsa, ebeveyn **nullptr** olur. Diğer tüm düğümler için döndürülen değer, düğümün [XmlNode::get_NodeType](../get_nodetype/) değerine bağlıdır. Aşağıdaki tablo, **get_NodeType** metodunun olası dönüş değerlerini açıklar. |||
|-|-|
| NodeType | ParentNode'un Dönüş Değeri |
| Attribute, Document, DocumentFragment, Entity, Notation | nullptr döndürür; bu düğümlerin ebeveyni yoktur. |
| CDATA | CDATA bölümünü içeren öğeyi veya varlık referansını döndürür. |
| Comment | Yorumu içeren öğeyi, varlık referansını, belge türünü veya belgeyi döndürür. |
| DocumentType | Belge düğümünü döndürür. |
| Element | Öğenin ebeveyn düğümünü döndürür. Eğer öğe ağacın kök düğümü ise, ebeveyn belge düğümüdür. |
| EntityReference | Varlık referansını içeren öğeyi, niteliği veya varlık referansını döndürür. |
| ProcessingInstruction | İşlem talimatını içeren belgeyi, öğeyi, belge türünü veya varlık referansını döndürür. |
| Text | Metin düğümünü içeren ebeveyn öğeyi, niteliği veya varlık referansını döndürür. |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
