---
title: "System::Xml::Schema::XmlSchemaGroupRef sınıfı"
linktitle: "XmlSchemaGroupRef"
second_title: "Aspose.Font için C++"
description: "System::Xml::Schema::XmlSchemaGroupRef sınıfı. Dünya Çapında Web Konsorsiyumu (W3C) tarafından belirlenen XML Schema'dan ref özniteliğine sahip group öğesini temsil eder. Bu sınıf, C++'ta şema seviyesinde tanımlanan bir grup referans veren karmaşık tipler içinde kullanılır."
type: docs
weight: 3300
url: /tr/cpp/system.xml.schema/xmlschemagroupref/
---
## XmlSchemaGroupRef class


XML [Schema](../) tarafından belirlenen **group** öğesini **ref** özniteliğiyle temsil eder, Dünya Çapında Web [Web](../../system.web/) Konsorsiyumu (W3C) tarafından tanımlanmıştır. Bu sınıf, **schema** seviyesinde tanımlanan **group**'a referans veren karmaşık tipler içinde kullanılır.

```cpp
class XmlSchemaGroupRef : public System::Xml::Schema::XmlSchemaParticle
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_Particle](./get_particle/)() | Aşağıdaki sınıflardan birini döndürür: [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/), veya [XmlSchemaSequence](../xmlschemasequence/) sınıfları, **Particle** değerinin derleme sonrası yorumlamasını tutar. |
| [get_RefName](./get_refname/)() | Bu şemada tanımlı bir grubun adını döndürür (veya belirtilen ad alanı tarafından gösterilen başka bir şemada). |
| [set_RefName](./set_refname/)(const SharedPtr\<XmlQualifiedName\>\&) | Bu şemada tanımlı bir grubun adını ayarlar (veya belirtilen ad alanı tarafından gösterilen başka bir şemada). |
| [XmlSchemaGroupRef](./xmlschemagroupref/)() | Yeni bir [XmlSchemaGroupRef](./) sınıfının örneğini başlatır. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma ad. |
## Açıklamalar



Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu türden örnekleri yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) göstericisine sarın ve bu göstericiyi fonksiyonlara argüman olarak geçirmek için kullanın.

## Ayrıca Bakınız

* Class [XmlSchemaParticle](../xmlschemaparticle/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
