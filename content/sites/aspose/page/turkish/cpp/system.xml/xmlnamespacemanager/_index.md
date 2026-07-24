---
title: "System::Xml::XmlNamespaceManager sınıfı"
linktitle: "XmlNamespaceManager"
second_title: "Aspose.Page için C++"
description: "System::Xml::XmlNamespaceManager sınıfı. Bir koleksiyonda ad alanlarını çözer, ekler ve kaldırır ve C++'ta bu ad alanları için kapsam yönetimi sağlar."
type: docs
weight: 2300
url: /tr/cpp/system.xml/xmlnamespacemanager/
---
## XmlNamespaceManager class


Bir koleksiyondaki ad alanlarını çözer, ekler ve kaldırır ve bu ad alanları için kapsam yönetimi sağlar.

```cpp
class XmlNamespaceManager : public System::Xml::IXmlNamespaceResolver,
                            public System::Collections::Generic::IEnumerable<String>
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [AddNamespace](./addnamespace/)(String, String) | Verilen ad alanını koleksiyona ekler. |
| virtual [get_DefaultNamespace](./get_defaultnamespace/)() | Varsayılan ad alanı için ad alanı URI'sini döndürür. |
| virtual [get_NameTable](./get_nametable/)() | Bu nesneyle ilişkili [XmlNameTable](../xmlnametable/) döndürür. |
| [GetEnumerator](./getenumerator/)() override | [XmlNamespaceManager](./) içindeki ad alanları arasında yineleme yapmak için kullanılacak bir enumerator döndürür. |
| [GetNamespacesInScope](./getnamespacesinscope/)(XmlNamespaceScope) override | Şu anda kapsamda olan ad alanlarını sıralamak için kullanılabilecek, önek anahtarıyla ad alanı adlarının bir koleksiyonunu döndürür. |
| virtual [HasNamespace](./hasnamespace/)(String) | Sağlanan önekin, şu anda itilen kapsam için tanımlı bir ad alanına sahip olup olmadığını gösteren bir değer döndürür. |
| [LookupNamespace](./lookupnamespace/)(const String\&) override | Belirtilen önek için ad alanı URI'sini döndürür. |
| [LookupPrefix](./lookupprefix/)(const String\&) override | Verilen ad alanı URI'si için bildirilen öneki bulur. |
| virtual [PopScope](./popscope/)() | Bir ad alanı kapsamını yığından çıkarır. |
| virtual [PushScope](./pushscope/)() | Bir ad alanı kapsamını yığına ekler. |
| virtual [RemoveNamespace](./removenamespace/)(String, String) | Verilen önek için verilen ad alanını kaldırır. |
| [XmlNamespaceManager](./xmlnamespacemanager/)(const SharedPtr\<XmlNameTable\>\&) | Belirtilen [XmlNameTable](../xmlnametable/) ile yeni bir [XmlNamespaceManager](./) sınıfının örneğini başlatır. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma addır. |
## Açıklamalar



Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Yığını üzerinde veya new operatörüyle bu tipin örneklerini asla oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

## Ayrıca Bakınız

* Class [IXmlNamespaceResolver](../ixmlnamespaceresolver/)
* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
