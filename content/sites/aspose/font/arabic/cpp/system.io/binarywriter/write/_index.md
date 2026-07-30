---
title: "System::IO::BinaryWriter::Write طريقة"
linktitle: "Write"
second_title: "Aspose.Font لـ C++"
description: "System::IO::BinaryWriter::Write طريقة. يكتب بايتًا واحدًا بقيمة 0 إذا كانت القيمة ''true'' و 1 إذا كانت القيمة ''false'' إلى دفق الإخراج في C++."
type: docs
weight: 800
url: /ar/cpp/system.io/binarywriter/write/
---
## BinaryWriter::Write(bool) method


يكتب بايتًا واحدًا بقيمة 0 إذا كان **value** 'true' و1 إذا كان **value** 'false' إلى تدفق الإخراج.

```cpp
virtual void System::IO::BinaryWriter::Write(bool value)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| قيمة | bool | القيمة المنطقية التي تحدد قيمة البايت للكتابة إلى دفق الإخراج |

## انظر أيضًا

* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## BinaryWriter::Write(char16_t) method


يكتب قيمة الحرف بعرض 16 بت المحددة إلى تدفق الإخراج.

```cpp
virtual void System::IO::BinaryWriter::Write(char16_t value)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| قيمة | char16_t | القيمة المراد كتابتها |

## انظر أيضًا

* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## BinaryWriter::Write(const ArrayPtr\<char_t\>\&, int, int) method


يكتب النطاق الفرعي المحدد من أحرف UTF-16 من مصفوفة الأحرف المحددة إلى تدفق الإخراج.

```cpp
virtual void System::IO::BinaryWriter::Write(const ArrayPtr<char_t> &buffer, int index=0, int count=-1)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | const ArrayPtr\<char_t\>\& | المصفوفة التي تحتوي على الأحرف المراد كتابتها |
| الفهرس | int | فهرس يبدأ من الصفر للعنصر في **buffer** الذي يبدأ منه النطاق الفرعي للكتابة |
| count | int | عدد الأحرف في النطاق الفرعي للكتابة؛ -1 يحدد أن النطاق الفرعي ينتهي حيث تنتهي مصفوفة **buffer** |

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## BinaryWriter::Write(const ArrayPtr\<uint8_t\>\&, int, int) method


يكتب النطاق الفرعي المحدد من البايتات من مصفوفة البايتات المحددة إلى تدفق الإخراج.

```cpp
virtual void System::IO::BinaryWriter::Write(const ArrayPtr<uint8_t> &buffer, int index=0, int count=-1)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | const ArrayPtr\<uint8_t\>\& | المصفوفة التي تحتوي على البايتات للكتابة |
| الفهرس | int | فهرس يبدأ من الصفر للعنصر في **buffer** الذي يبدأ منه النطاق الفرعي للكتابة |
| count | int | عدد العناصر في النطاق الفرعي للكتابة؛ -1 يحدد أن النطاق الفرعي ينتهي حيث تنتهي مصفوفة **buffer** |

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## BinaryWriter::Write(const char_t *) method


يكتب سلسلة مسبوقة بطول في الترميز الحالي إلى تدفق الإخراج.

```cpp
virtual void System::IO::BinaryWriter::Write(const char_t *value)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| قيمة | const char_t * | سلسلة c-string المراد كتابتها |

## انظر أيضًا

* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## BinaryWriter::Write(const Decimal\&) method


يكتب تمثيل البايت للقيمة [Decimal](../../../system/decimal/) المحددة إلى دفق الإخراج.

```cpp
virtual void System::IO::BinaryWriter::Write(const Decimal &value)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| قيمة | const Decimal\& | القيمة المراد كتابتها |

## انظر أيضًا

* Class [Decimal](../../../system/decimal/)
* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## BinaryWriter::Write(const String\&) method


يكتب سلسلة مسبوقة بطول في الترميز الحالي إلى تدفق الإخراج.

```cpp
virtual void System::IO::BinaryWriter::Write(const String &value)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| قيمة | const String\& | السلسلة المراد كتابتها |

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## BinaryWriter::Write(double) method


يكتب قيمة النقطة العائمة ذات الدقة المزدوجة المحددة إلى تدفق الإخراج.

```cpp
virtual void System::IO::BinaryWriter::Write(double value)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| قيمة | double | القيمة المراد كتابتها |

## انظر أيضًا

* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## BinaryWriter::Write(float) method


يكتب قيمة النقطة العائمة ذات الدقة المفردة المحددة إلى تدفق الإخراج.

```cpp
virtual void System::IO::BinaryWriter::Write(float value)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| قيمة | float | القيمة المراد كتابتها |

## انظر أيضًا

* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## BinaryWriter::Write(int) method


يكتب قيمة العدد الصحيح 32‑بت المحددة إلى تدفق الإخراج.

```cpp
virtual void System::IO::BinaryWriter::Write(int value)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| قيمة | int | القيمة المراد كتابتها |

## انظر أيضًا

* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## BinaryWriter::Write(int16_t) method


يكتب قيمة العدد الصحيح 16‑بت المحددة إلى تدفق الإخراج.

```cpp
virtual void System::IO::BinaryWriter::Write(int16_t value)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| قيمة | int16_t | القيمة المراد كتابتها |

## انظر أيضًا

* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## BinaryWriter::Write(int64_t) method


يكتب قيمة العدد الصحيح 64‑بت المحددة إلى تدفق الإخراج.

```cpp
virtual void System::IO::BinaryWriter::Write(int64_t value)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| قيمة | int64_t | القيمة المراد كتابتها |

## انظر أيضًا

* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## BinaryWriter::Write(uint16_t) method


يكتب قيمة العدد الصحيح غير الموقّع 16‑بت المحددة إلى تدفق الإخراج.

```cpp
virtual void System::IO::BinaryWriter::Write(uint16_t value)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| قيمة | uint16_t | القيمة المراد كتابتها |

## انظر أيضًا

* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## BinaryWriter::Write(uint32_t) method


يكتب قيمة العدد الصحيح غير الموقّع 32‑بت المحددة إلى تدفق الإخراج.

```cpp
virtual void System::IO::BinaryWriter::Write(uint32_t value)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| قيمة | uint32_t | القيمة المراد كتابتها |

## انظر أيضًا

* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## BinaryWriter::Write(uint64_t) method


يكتب قيمة العدد الصحيح غير الموقّع 64‑بت المحددة إلى تدفق الإخراج.

```cpp
virtual void System::IO::BinaryWriter::Write(uint64_t value)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| قيمة | uint64_t | القيمة المراد كتابتها |

## انظر أيضًا

* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## BinaryWriter::Write(uint8_t) method


يكتب القيمة الصحيحة غير الموقعة ذات 8 بت المحددة إلى تدفق الإخراج.

```cpp
virtual void System::IO::BinaryWriter::Write(uint8_t value)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| قيمة | uint8_t | القيمة المراد كتابتها |

## انظر أيضًا

* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
