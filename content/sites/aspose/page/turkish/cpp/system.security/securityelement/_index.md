---
title: "System::Security::SecurityElement sınıfı"
linktitle: "SecurityElement"
second_title: "Aspose.Page için C++"
description: "System::Security::SecurityElement sınıfı. Güvenlik nesnesini kodlamak için XML nesne modeli. Henüz uygulanmadı. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Yığın üzerinde veya new operatörüyle bu tipin örneğini oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına neden olur. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 300
url: /tr/cpp/system.security/securityelement/
---
## SecurityElement class


Güvenlik nesnesini kodlamak için XML nesne modeli. Henüz uygulanmadı. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Yığın üzerinde veya new operatörüyle bu tipin örneğini oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına neden olur. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class SecurityElement : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [AddAttribute](./addattribute/)(const String\&, const String\&) | Etikete öznitelik ekler. |
| [AddChild](./addchild/)(SecurityElement) | Alt etiketi ekler. |
| [Attribute](./attribute/)(const String\&) | Öznitelik değerini alır. |
| [Copy](./copy/)() | Etiketi kopyalar. |
| [Equal](./equal/)(SecurityElement) | Parametrelerin eşitliğini kontrol eder. |
| static [Escape](./escape/)(const String\&) | XML dizesindeki karakterleri kaçırır. |
| static [FromString](./fromstring/)(const String\&) | XML kodundan öğe oluşturur. |
| [get_Attributes](./get_attributes/)() | Etiket özniteliklerini alır. |
| [get_Children](./get_children/)() | Etiketin alt nesnelerini alır. |
| [get_Tag](./get_tag/)() | Etiket adını alır. |
| [get_Text](./get_text/)() | Etiketin iç metnini alır. |
| static [IsValidAttributeName](./isvalidattributename/)(const String\&) | Öznitelik adının geçerli olup olmadığını kontrol eder. |
| static [IsValidAttributeValue](./isvalidattributevalue/)(const String\&) | Öznitelik değerinin geçerli olup olmadığını kontrol eder. |
| static [IsValidTag](./isvalidtag/)(const String\&) | Etiketin geçerli olup olmadığını kontrol eder. |
| static [IsValidText](./isvalidtext/)(const String\&) | Metnin geçerli olup olmadığını kontrol eder. |
| [SearchForChildByTag](./searchforchildbytag/)(const String\&) | İsimle çocuk etiketi alır. |
| [SearchForTextOfTag](./searchfortextoftag/)(const String\&) | Etiket adıyla çocuk etiketin iç metnini alır. |
| [SecurityElement](./securityelement/)(const String\&) | Yapıcı. |
| [SecurityElement](./securityelement/)(const String\&, const String\&) | Yapıcı. |
| [set_Attributes](./set_attributes/)(System::Collections::Generic::Dictionary\<String, String\>) | Etiket özniteliklerini ayarlar. |
| [set_Children](./set_children/)(System::Collections::Generic::List\<SecurityElement\>) | Etiketin çocuk nesnelerini ayarlar. |
| [set_Tag](./set_tag/)(const String\&) | Etiket adını ayarlar. |
| [set_Text](./set_text/)(const String\&) | Etiketin iç metnini ayarlar. |
| [ToString](./tostring/)() const override | Etiketi dizeye dönüştürür. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Security](../)
* Library [Aspose.Page for C++](../../)
