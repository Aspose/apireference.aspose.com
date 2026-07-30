---
title: "System::Security::Cryptography::Xml::Transform sınıfı"
linktitle: "Dönüştürme"
second_title: "Aspose.Font için C++"
description: "System::Security::Cryptography::Xml::Transform sınıfı. İmzalayan tarafından verinin dönüştürülmesi hakkında bilgi sağlar. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak allocate edilmelidir. Bu tip bir örneği yığıt üzerinde ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirin."
type: docs
weight: 1100
url: /tr/cpp/system.security.cryptography.xml/transform/
---
## Transform class


İmzalayan tarafından verinin dönüştürülmesi hakkında bilgi sağlar. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak allocate edilmelidir. Bu tip bir örneği yığıt üzerinde ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

```cpp
class Transform : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_Algorithm](./get_algorithm/)() |  |
| [get_Context](./get_context/)() |  |
| virtual [get_InputTypes](./get_inputtypes/)() |  |
| virtual [get_OutputTypes](./get_outputtypes/)() |  |
| [get_PropagatedNamespaces](./get_propagatednamespaces/)() |  |
| virtual [GetDigestedOutput](./getdigestedoutput/)(SharedPtr\<HashAlgorithm\>) |  |
| virtual [GetOutput](./getoutput/)() |  |
| virtual [GetOutput](./getoutput/)(const TypeInfo\&) |  |
| virtual [LoadInnerXml](./loadinnerxml/)(SharedPtr\<System::Xml::XmlNodeList\>) |  |
| virtual [LoadInput](./loadinput/)(SharedPtr\<Object\>) |  |
| [set_Algorithm](./set_algorithm/)(String) |  |
| [set_Context](./set_context/)(SharedPtr\<System::Xml::XmlElement\>) |  |
| [set_Resolver](./set_resolver/)(SharedPtr\<System::Xml::XmlResolver\>) |  |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography::Xml](../)
* Library [Aspose.Font for C++](../../)
