---
title: "System::Xml::XmlComment::CloneNode yöntemi"
linktitle: "CloneNode"
second_title: "Aspose.Page için C++"
description: "System::Xml::XmlComment::CloneNode yöntemi. Bu düğümün bir kopyasını C++'ta oluşturur."
type: docs
weight: 100
url: /tr/cpp/system.xml/xmlcomment/clonenode/
---
## XmlComment::CloneNode method


Bu düğümün bir kopyasını oluşturur.

```cpp
SharedPtr<XmlNode> System::Xml::XmlComment::CloneNode(bool deep) override
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| derin | bool | **true** belirtilen düğümün altındaki alt ağacı yinelemeli olarak kopyalamak için; **false** yalnızca düğümü kendisini kopyalamak için. Yorum düğümlerinin alt düğümü olmadığından, kopyalanan düğüm her zaman metin içeriğini içerir, parametre ayarına bakılmaksızın. |

### ReturnValue

Kopyalanan düğüm.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlComment](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
