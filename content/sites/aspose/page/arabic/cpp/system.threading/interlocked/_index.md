---
title: "فئة System::Threading::Interlocked"
linktitle: "Interlocked"
second_title: "Aspose.Page لـ C++"
description: "فئة System::Threading::Interlocked. توفر واجهة برمجة تطبيقات للعمليات الآمنة عبر الخيوط. هذا نوع ثابت لا يحتوي على خدمات كائنات. يجب ألا تنشئ أي حالات منه بأي وسيلة في C++."
type: docs
weight: 600
url: /ar/cpp/system.threading/interlocked/
---
## Interlocked class


يوفر API للعمليات الآمنة عبر الخيوط. هذا نوع ثابت لا يحتوي على خدمات مثيلات. يجب ألا تقوم بإنشاء مثيلات له بأي وسيلة.

```cpp
class Interlocked
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| static [Add](./add/)(int32_t\&, int32_t) | يزيد القيمة بشكل ذري. |
| static [Add](./add/)(int64_t\&, int64_t) | يزيد القيمة بشكل ذري. |
| static [CompareExchange](./compareexchange/)(T\&, T, T) | يقارن ويستبدل القيمة على المتغير: يتحقق مما إذا كان المتغير يساوي قيمة محددة ويخزن القيمة الجديدة فقط إذا كانت القيمة المخزنة تطابق المتوقعة. |
| static [CompareExchange](./compareexchange/)(T\&, T, T) | يقارن ويستبدل القيمة على المتغير: يتحقق مما إذا كان المتغير يساوي قيمة محددة ويخزن القيمة الجديدة فقط إذا كانت القيمة المخزنة تطابق المتوقعة. غير مُنفَّذ. |
| static [CompareExchange](./compareexchange/)(int32_t\&, int32_t, int32_t, bool\&) | يقارن ويستبدل القيمة على المتغير: يتحقق مما إذا كان المتغير يساوي قيمة محددة ويخزن القيمة الجديدة فقط إذا كانت القيمة المخزنة تطابق المتوقعة. |
| static [Decrement](./decrement/)(int32_t\&) | ينقص القيمة بشكل ذري. |
| static [Decrement](./decrement/)(int64_t\&) | ينقص القيمة بشكل ذري. |
| static [Exchange](./exchange/)(T\&, T) | يستبدل القيمة على المتغير: يخزن القيمة الجديدة ويعيد القيمة التي كان المتغير يحملها مباشرةً قبل التخزين. |
| static [Exchange](./exchange/)(T\&, T) | يستبدل القيمة على المتغير: يخزن القيمة الجديدة ويعيد القيمة التي كان المتغير يحملها مباشرةً قبل التخزين. غير مُنفَّذ. |
| static [ExchangeAdd](./exchangeadd/)(int32_t\&, int32_t) | يزيد القيمة بشكل ذري عبر إجراء exchange-add. |
| static [ExchangeAdd](./exchangeadd/)(int64_t\&, int64_t) | يزيد القيمة بشكل ذري عبر إجراء exchange-add. |
| static [Increment](./increment/)(int32_t\&) | يزيد القيمة بشكل ذري. |
| static [Increment](./increment/)(int64_t\&) | يزيد القيمة بشكل ذري. |
| static [Read](./read/)(int64_t\&) | يعيد قيمة 64‑بت، يتم تحميلها كعملية ذرية. |
## انظر أيضًا

* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
