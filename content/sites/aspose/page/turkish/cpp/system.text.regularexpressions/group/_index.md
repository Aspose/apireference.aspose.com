---
title: "System::Text::RegularExpressions::Group class"
linktitle: "Group"
second_title: "Aspose.Page için C++"
description: "System::Text::RegularExpressions::Group class. Tek bir yakalama grubu tarafından yapılan eşleştirmenin sonucu. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak allocate edilmelidir. Bu tür bir örneği yığıt (stack) üzerinde veya operator new kullanarak oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 300
url: /tr/cpp/system.text.regularexpressions/group/
---
## Group class


Tek bir yakalama grubu tarafından yapılan eşleştirmenin sonucu. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak allocate edilmelidir. Bu tür bir örneği yığıt üzerinde veya operator new kullanarak oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class Group : public System::Text::RegularExpressions::Capture
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [AddCapture](./addcapture/)(const CapturePtr\&) | Gruba yakalama ekler. |
| [get_Captures](./get_captures/)() | Mevcut yakalamaları alır. |
| [get_Success](./get_success/)() | Bu grup için yakalamanın başarılı olup olmadığını kontrol eder. |
| [Group](./group/)(const UStringPtr\&, int, int) | Yapıcı. |
| [Group](./group/)() | Boş grup yapıcısı. |
## Ayrıca Bakınız

* Class [Capture](../capture/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Page for C++](../../)
