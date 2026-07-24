---
title: "System::Windows::Forms::IButtonControl class"
linktitle: "IButtonControl"
second_title: "Aspose.Page için C++"
description: "System::Windows::Forms::IButtonControl class. IButtonControl arayüzünü kullanan çevrilmiş kodun derlenebilir olmasını sağlamak için sahte sınıf. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak allocate edilmelidir. Bu tipin örneğini yığına (stack) veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 300
url: /tr/cpp/system.windows.forms/ibuttoncontrol/
---
## IButtonControl class


Çevrilmiş kodun [IButtonControl](./) arayüzünü kullanabilmesini sağlamak için sahte sınıf. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak allocate edilmelidir. Bu tipin örneğini yığına (stack) veya new operatörüyle asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class IButtonControl : public virtual System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [get_DialogResult](./get_dialogresult/)() | RTTI bilgisi. |
| virtual [NotifyDefault](./notifydefault/)(bool) | Kontrolü varsayılan veya varsayılan olmayan hâle getirir. |
| virtual [PerformClick](./performclick/)() | Düğmeye tıklamayı gerçekleştirir. |
| virtual [set_DialogResult](./set_dialogresult/)(DialogResult) | Düğmeye bağlı iletişim kutusu sonucunu ayarlar. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Windows::Forms](../)
* Library [Aspose.Page for C++](../../)
