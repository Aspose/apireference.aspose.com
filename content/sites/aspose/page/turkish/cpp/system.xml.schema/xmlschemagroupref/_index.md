---
title: "System::Xml::Schema::XmlSchemaGroupRef class"
linktitle: "XmlSchemaGroupRef"
second_title: "Aspose.Page için C++"
description: "System::Xml::Schema::XmlSchemaGroupRef sınıfı. Dünya Çapında Web Konsorsiyumu (W3C) tarafından belirlenen XML Şema'sından ref özniteliğine sahip grup öğesini temsil eder. Bu sınıf, C++'da şema seviyesinde tanımlanan bir grubu referans alan karmaşık tiplerde kullanılır."
type: docs
weight: 3300
url: /tr/cpp/system.xml.schema/xmlschemagroupref/
---
## XmlSchemaGroupRef class


**group** öğesini **ref** özniteliğiyle XML [Schema](../) üzerinden, Dünya Çapında [Web](../../system.web/) Konsorsiyumu (W3C) tarafından belirtildiği gibi temsil eder. Bu sınıf, **schema** seviyesinde tanımlanan bir **group**'a başvuran karmaşık tiplerde kullanılır.

```cpp
class XmlSchemaGroupRef : public System::Xml::Schema::XmlSchemaParticle
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_Particle](./get_particle/)() | Derleme sonrası **Particle** değerinin yorumunu tutan [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/) veya [XmlSchemaSequence](../xmlschemasequence/) sınıflarından birini döndürür. |
| [get_RefName](./get_refname/)() | Bu şemada (veya belirtilen ad alanı tarafından gösterilen başka bir şemada) tanımlanan bir grubun adını döndürür. |
| [set_RefName](./set_refname/)(const SharedPtr\<XmlQualifiedName\>\&) | Bu şemada (veya belirtilen ad alanı tarafından gösterilen başka bir şemada) tanımlanan bir grubun adını ayarlar. |
| [XmlSchemaGroupRef](./xmlschemagroupref/)() | Yeni bir [XmlSchemaGroupRef](./) sınıfının örneğini başlatır. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma addır. |
## Açıklamalar



Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Yığını üzerinde veya new operatörüyle bu tipin örneklerini asla oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

## Ayrıca Bakınız

* Class [XmlSchemaParticle](../xmlschemaparticle/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
