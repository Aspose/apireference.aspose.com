---
title: "الفئة System::Threading::Interlocked"
linktitle: "Interlocked"
second_title: "Aspose.Font لـ C++"
description: "الفئة System::Threading::Interlocked. توفر واجهة برمجة تطبيقات للعمليات الآمنة عبر الخيوط. هذه فئة ثابتة لا تحتوي على خدمات مثيل. لا يجب عليك أبدًا إنشاء نسخ منها بأي طريقة في C++."
type: docs
weight: 600
url: /ar/cpp/system.threading/interlocked/
---
## Interlocked class


يوفر واجهة برمجة تطبيقات للعمليات الآمنة من الخيوط. هذا نوع ثابت لا يحتوي على خدمات مثيل. يجب ألا تنشئ أي مثيلات له بأي وسيلة.

```cpp
class Interlocked
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| static [Add](./add/)(int32_t\&, int32_t) | يزيد القيمة بصورة ذرية. |
| static [Add](./add/)(int64_t\&, int64_t) | يزيد القيمة بصورة ذرية. |
| static [CompareExchange](./compareexchange/)(T\&, T, T) | قارن-التبادلات القيمة على المتغير: يتحقق مما إذا كان المتغير يساوي قيمة محددة ويخزن القيمة الجديدة فقط إذا كانت القيمة المخزنة تطابق المتوقعة. |
| static [CompareExchange](./compareexchange/)(T\&, T, T) | قارن-التبادلات القيمة على المتغير: يتحقق مما إذا كان المتغير يساوي قيمة محددة ويخزن القيمة الجديدة فقط إذا كانت القيمة المخزنة تطابق المتوقعة. غير مُنفّذ. |
| static [CompareExchange](./compareexchange/)(int32_t\&, int32_t, int32_t, bool\&) | قارن-التبادلات القيمة على المتغير: يتحقق مما إذا كان المتغير يساوي قيمة محددة ويخزن القيمة الجديدة فقط إذا كانت القيمة المخزنة تطابق المتوقعة. |
| static [Decrement](./decrement/)(int32_t\&) | يُنقص القيمة بشكل ذري. |
| static [Decrement](./decrement/)(int64_t\&) | يُنقص القيمة بشكل ذري. |
| static [Exchange](./exchange/)(T\&, T) | يبدل القيمة على المتغير: يخزن القيمة الجديدة ويعيد القيمة التي كان المتغير يحملها مباشرةً قبل التخزين. |
| static [Exchange](./exchange/)(T\&, T) | يبدل القيمة على المتغير: يخزن القيمة الجديدة ويعيد القيمة التي كان المتغير يحملها مباشرةً قبل التخزين. غير مُنفّذ. |
| static [ExchangeAdd](./exchangeadd/)(int32_t\&, int32_t) | يزيد القيمة بشكل ذري عبر إجراء التبادل-الإضافة. |
| static [ExchangeAdd](./exchangeadd/)(int64_t\&, int64_t) | يزيد القيمة بشكل ذري عبر إجراء التبادل-الإضافة. |
| static [Increment](./increment/)(int32_t\&) | يزيد القيمة بشكل ذري. |
| static [Increment](./increment/)(int64_t\&) | يزيد القيمة بشكل ذري. |
| static [Read](./read/)(int64_t\&) | يعيد قيمة 64‑بت، يتم تحميلها كعملية ذرية. |
## انظر أيضًا

* Namespace [System::Threading](../)
* Library [Aspose.Font for C++](../../)
