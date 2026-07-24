---
title: "System::Text::RegularExpressions::CaptureCollection class"
linktitle: "CaptureCollection"
second_title: "Aspose.Page için C++"
description: "System::Text::RegularExpressions::CaptureCollection sınıfı. Tek bir yakalama grubunun yaptığı yakalamaların listesi. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek hiçbir zaman yığına (stack) veya new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 200
url: /tr/cpp/system.text.regularexpressions/capturecollection/
---
## CaptureCollection class


Tek bir yakalama grubunun yaptığı yakalamaların listesi. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek hiçbir zaman yığına (stack) veya new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class CaptureCollection : public System::Collections::Generic::List<CapturePtr>
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Add](./add/)(const CapturePtr\&) override | Koleksiyon değişikliğini devre dışı bırakır. |
| [AddCapture](./addcapture/)(const CapturePtr\&) | Koleksiyona yakalama eklemek için hizmet yöntemi. |
| [Clear](./clear/)() override | Koleksiyon temizlemeyi devre dışı bırakır. |
| [get_Count](./get_count/)() const override | Yakalamaların sayısını alır. |
| [get_IsReadOnly](./get_isreadonly/)() const override | Koleksiyonu yalnızca okunur olarak işaretler. |
| [get_IsSynchronized](./get_issynchronized/)() const | Koleksiyonu eşzamanlı olmayan olarak işaretler. |
| [idx_get](./idx_get/)(int) const override | [Capture](../capture/) erişicisi. |
| [operator[]](./operator[]/)(int) | [Capture](../capture/) erişicisi. |
| [operator[]](./operator[]/)(int) const | [Capture](../capture/) erişicisi. |
| [Remove](./remove/)(const CapturePtr\&) override | Koleksiyon değişikliğini devre dışı bırakır. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Base](./base/) | [Base](./base/) türü. |
## Ayrıca Bakınız

* Class [List](../../system.collections.generic/list/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Page for C++](../../)
