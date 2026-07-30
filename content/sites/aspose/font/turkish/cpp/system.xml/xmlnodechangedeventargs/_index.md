---
title: "System::Xml::XmlNodeChangedEventArgs class"
linktitle: "XmlNodeChangedEventArgs"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlNodeChangedEventArgs sınıfı. C++'ta XmlDocument::NodeChanged, XmlDocument::NodeChanging, XmlDocument::NodeInserted, XmlDocument::NodeInserting, XmlDocument::NodeRemoved ve XmlDocument::NodeRemoving olayları için veri sağlar."
type: docs
weight: 2600
url: /tr/cpp/system.xml/xmlnodechangedeventargs/
---
## XmlNodeChangedEventArgs class


**XmlDocument::NodeChanged**, **XmlDocument::NodeChanging**, **XmlDocument::NodeInserted**, **XmlDocument::NodeInserting**, **XmlDocument::NodeRemoved** ve **XmlDocument::NodeRemoving** olayları için veri sağlar.

```cpp
class XmlNodeChangedEventArgs : public System::EventArgs
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_Action](./get_action/)() | Gerçekleşen düğüm değişikliği olayının türünü belirten bir değer döndürür. |
| [get_NewParent](./get_newparent/)() | İşlem tamamlandıktan sonra [XmlNode::get_ParentNode](../xmlnode/get_parentnode/) değerini döndürür. |
| [get_NewValue](./get_newvalue/)() | Düğümün yeni değerini döndürür. |
| [get_Node](./get_node/)() | Eklenen, kaldırılan veya değiştirilen [XmlNode](../xmlnode/) öğesini döndürür. |
| [get_OldParent](./get_oldparent/)() | İşlem başlamadan önce [XmlNode::get_ParentNode](../xmlnode/get_parentnode/) değerini döndürür. |
| [get_OldValue](./get_oldvalue/)() | Düğümün orijinal değerini döndürür. |
| [XmlNodeChangedEventArgs](./xmlnodechangedeventargs/)(const SharedPtr\<XmlNode\>\&, const SharedPtr\<XmlNode\>\&, const SharedPtr\<XmlNode\>\&, const String\&, const String\&, XmlNodeChangedAction) | [XmlNodeChangedEventArgs](./) sınıfının yeni bir örneğini başlatır. |
## Alanlar

| Alan | Açıklama |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | Boş bir [EventArgs](../../system/eventargs/) paylaşımlı işaretçiyi (null-pointer) temsil eden statik bir üye. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma ad. |
## Açıklamalar



Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu türden örnekleri yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) göstericisine sarın ve bu göstericiyi fonksiyonlara argüman olarak geçirmek için kullanın.

## Ayrıca Bakınız

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
