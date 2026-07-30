---
title: "System::Text::RegularExpressions::Capture class"
linktitle: "Capture"
second_title: "Aspose.Font için C++"
description: "System::Text::RegularExpressions::Capture sınıfı. Tek bir alt ifade eşleşmesinin sonucudur. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Yığın (stack) üzerinde veya new operatörüyle bu tipin örneği oluşturulmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 100
url: /tr/cpp/system.text.regularexpressions/capture/
---
## Capture class


Tek bir alt ifade eşleşmesinin sonucudur. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Yığın (stack) üzerinde veya new operatörüyle bu tipin örneği oluşturulmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class Capture : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Capture](./capture/)(const UStringPtr\&, int, int) | Yapıcı. |
| [get_Index](./get_index/)() const | Yakalanan alt dizenin indeksini alır. |
| [get_Length](./get_length/)() const | Yakalanan alt dizenin uzunluğunu alır. |
| [get_Value](./get_value/)() const | Yakalanan alt dizeni alır. |
| [ToString](./tostring/)() const override | Yakalanan alt dizeni alır. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Font for C++](../../)
