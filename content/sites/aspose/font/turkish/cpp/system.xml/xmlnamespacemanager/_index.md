---
title: "System::Xml::XmlNamespaceManager sınıfı"
linktitle: "XmlNamespaceManager"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlNamespaceManager sınıfı. Bir koleksiyona ad alanlarını çözer, ekler ve kaldırır ve bu ad alanları için C++'da kapsam yönetimi sağlar."
type: docs
weight: 2300
url: /tr/cpp/system.xml/xmlnamespacemanager/
---
## XmlNamespaceManager class


Bir koleksiyona ad alanlarını çözer, ekler ve kaldırır ve bu ad alanları için kapsam yönetimi sağlar.

```cpp
class XmlNamespaceManager : public System::Xml::IXmlNamespaceResolver,
                            public System::Collections::Generic::IEnumerable<String>
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [AddNamespace](./addnamespace/)(String, String) | Verilen ad alanını koleksiyona ekler. |
| virtual [get_DefaultNamespace](./get_defaultnamespace/)() | Varsayılan ad alanı için ad alanı URI'sini döndürür. |
| virtual [get_NameTable](./get_nametable/)() | Bu nesneyle ilişkili [XmlNameTable](../xmlnametable/) öğesini döndürür. |
| [GetEnumerator](./getenumerator/)() override | [XmlNamespaceManager](./) içindeki ad alanları arasında dolaşmak için kullanılacak bir yineleyici döndürür. |
| [GetNamespacesInScope](./getnamespacesinscope/)(XmlNamespaceScope) override | Şu anda kapsamda olan ad alanlarını listelemek için kullanılabilecek, önek anahtarına göre ad alanı adlarının bir koleksiyonunu döndürür. |
| virtual [HasNamespace](./hasnamespace/)(String) | Sağlanan önekin, şu anda itilen kapsam için tanımlı bir ad alanına sahip olup olmadığını gösteren bir değeri döndürür. |
| [LookupNamespace](./lookupnamespace/)(const String\&) override | Belirtilen önek için ad alanı URI'sini döndürür. |
| [LookupPrefix](./lookupprefix/)(const String\&) override | Verilen ad alanı URI'si için bildirilen öneki bulur. |
| virtual [PopScope](./popscope/)() | Bir ad alanı kapsamını yığından çıkarır. |
| virtual [PushScope](./pushscope/)() | Bir ad alanı kapsamını yığına ekler. |
| virtual [RemoveNamespace](./removenamespace/)(String, String) | Verilen önek için verilen ad alanını kaldırır. |
| [XmlNamespaceManager](./xmlnamespacemanager/)(const SharedPtr\<XmlNameTable\>\&) | Belirtilen [XmlNameTable](../xmlnametable/) ile [XmlNamespaceManager](./) sınıfının yeni bir örneğini başlatır. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma ad. |
## Açıklamalar



Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu türden örnekleri yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) göstericisine sarın ve bu göstericiyi fonksiyonlara argüman olarak geçirmek için kullanın.

## Ayrıca Bakınız

* Class [IXmlNamespaceResolver](../ixmlnamespaceresolver/)
* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
