---
title: "System::Xml::XmlNode::get_ParentNode method"
linktitle: "get_ParentNode"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlNode::get_ParentNode method. Bu düğümün ebeveynini (ebeveyni olabilen düğümler için) C++'da döndürür."
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



Bir düğüm yeni oluşturulmuş ve henüz ağaca eklenmemişse ya da ağaçtan kaldırılmışsa, ebeveyn **nullptr** olur. Diğer tüm düğümler için döndürülen değer, düğümün [XmlNode::get_NodeType](../get_nodetype/) değerine bağlıdır. Aşağıdaki tablo, **get_NodeType** metodunun olası dönüş değerlerini açıklar. |||
|-|-|
| NodeType | ParentNode'un Dönüş Değeri |
| Attribute, Document, DocumentFragment, Entity, Notation | nullptr döndürür; bu düğümlerin ebeveyni yoktur. |
| CDATA | CDATA bölümünü içeren öğeyi veya varlık referansını döndürür. |
| Yorum | Yorumu içeren öğeyi, varlık referansını, belge tipini veya belgeyi döndürür. |
| BelgeTürü | Belge düğümünü döndürür. |
| Element | Öğenin ebeveyn düğümünü döndürür. Eğer öğe ağacın kök düğümü ise, ebeveyn belge düğümüdür. |
| EntityReference | Varlık referansını içeren öğeyi, özniteliği veya varlık referansını döndürür. |
| İşlemeTalimatı | İşlem talimatını içeren belgeyi, öğeyi, belge türünü veya varlık referansını döndürür. |
| Text | Metin düğümünü içeren üst öğeyi, niteliği veya varlık referansını döndürür. |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
