---
title: "System::Xml::XmlDeclaration::CloneNode method"
linktitle: "CloneNode"
second_title: "Aspose.Page için C++"
description: "System::Xml::XmlDeclaration::CloneNode yöntemi. Bu düğümün bir kopyasını C++'ta oluşturur."
type: docs
weight: 100
url: /tr/cpp/system.xml/xmldeclaration/clonenode/
---
## XmlDeclaration::CloneNode method


Bu düğümün bir kopyasını oluşturur.

```cpp
SharedPtr<XmlNode> System::Xml::XmlDeclaration::CloneNode(bool deep) override
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| deep | bool | **true** belirtilen düğümün altındaki alt ağacı yinelemeli olarak kopyalamak için; **false** yalnızca düğümü kendisini kopyalamak için. [XmlDeclaration](../) düğümlerinin çocuğu olmadığından, kopyalanan düğüm her zaman veri değerini içerir, parametre ayarına bakılmaksızın. |

### ReturnValue

Kopyalanan düğüm.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlDeclaration](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
