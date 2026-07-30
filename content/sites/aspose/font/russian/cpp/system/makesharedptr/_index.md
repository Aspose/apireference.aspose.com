---
title: "System::MakeSharedPtr метод"
linktitle: "MakeSharedPtr"
second_title: "Aspose.Font для C++"
description: "System::MakeSharedPtr метод. Преобразует обычный указатель в умный указатель. Перегрузка для const‑указателей. Полезно, например, при использовании переменной ''this'' в методах C#, переводимых как const в C++."
type: docs
weight: 24900
url: /ru/cpp/system/makesharedptr/
---
## System::MakeSharedPtr(const X *) method


Преобразует обычный указатель в умный указатель. Перегрузка для const‑указателей. Полезно, например, при использовании переменной 'this' в методах C#, переводимых как const.

```cpp
template<class X> SmartPtr<X> System::MakeSharedPtr(const X *p)
```


| Параметр | Описание |
| --- | --- |
| X | Тип указателя. |

| Параметр | Тип | Описание |
| --- | --- | --- |
| p | const X * | Обычный указатель на объект. |

### ReturnValue

Разделяемый умный указатель на объект.

## См. также

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::MakeSharedPtr(X *) method


Преобразует обычный указатель в умный указатель.

```cpp
template<class X> SmartPtr<X> System::MakeSharedPtr(X *p)
```


| Параметр | Описание |
| --- | --- |
| X | Тип указателя. |

| Параметр | Тип | Описание |
| --- | --- | --- |
| p | X * | Обычный указатель на объект. |

### ReturnValue

Разделяемый умный указатель на объект.

## См. также

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
