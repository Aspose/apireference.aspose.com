---
title: "System::Text::RegularExpressions::CaptureCollection class"
linktitle: "CaptureCollection"
second_title: "Aspose.Font için C++"
description: "System::Text::RegularExpressions::CaptureCollection sınıfı. Tek yakalama grubunun yaptığı yakalamaların listesi. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına neden olur. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 200
url: /tr/cpp/system.text.regularexpressions/capturecollection/
---
## CaptureCollection class


Tek yakalama grubunun yaptığı yakalamaların listesi. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına neden olur. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class CaptureCollection : public System::Collections::Generic::List<CapturePtr>
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Add](./add/)(const CapturePtr\&) override | Koleksiyon değişikliğini devre dışı bırakır. |
| [AddCapture](./addcapture/)(const CapturePtr\&) | Koleksiyona yakalama eklemek için hizmet yöntemi. |
| [Clear](./clear/)() override | Koleksiyon temizlemesini devre dışı bırakır. |
| [get_Count](./get_count/)() const override | Yakalamaların sayısını alır. |
| [get_IsReadOnly](./get_isreadonly/)() const override | Koleksiyonu yalnızca okunur olarak işaretler. |
| [get_IsSynchronized](./get_issynchronized/)() const | Koleksiyonu eşzamanlı olmayan olarak işaretler. |
| [idx_get](./idx_get/)(int) const override | [Capture](../capture/) erişici. |
| [operator[]](./operator[]/)(int) | [Capture](../capture/) erişici. |
| [operator[]](./operator[]/)(int) const | [Capture](../capture/) erişici. |
| [Remove](./remove/)(const CapturePtr\&) override | Koleksiyon değişikliğini devre dışı bırakır. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Base](./base/) | [Base](./base/) türü. |
## Ayrıca Bakınız

* Class [List](../../system.collections.generic/list/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Font for C++](../../)
