---
title: "System::MakeSharedPtr method"
linktitle: "MakeSharedPtr"
second_title: "Aspose.Page для C++"
description: "System::MakeSharedPtr method. Преобразует необработанный указатель в умный указатель. Перегрузка для указателей const. Полезно, например, при использовании ''this'' переменной в методах C#, переводимых как const в C++."
type: docs
weight: 24800
url: /ru/cpp/system/makesharedptr/
---
## System::MakeSharedPtr(const X *) method


Преобразует необработанный указатель в умный указатель. Перегрузка для указателей const. Полезно, например, при использовании 'this' переменной в методах C#, переводимых как const.

```cpp
template<class X> SmartPtr<X> System::MakeSharedPtr(const X *p)
```


| Параметр | Описание |
| --- | --- |
| X | Тип указуемого. |

| Параметр | Тип | Описание |
| --- | --- | --- |
| p | const X * | Необработанный указатель на объект. |

### ReturnValue

Разделяемый умный указатель на объект.

## См. также

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::MakeSharedPtr(X *) method


Преобразует необработанный указатель в умный указатель.

```cpp
template<class X> SmartPtr<X> System::MakeSharedPtr(X *p)
```


| Параметр | Описание |
| --- | --- |
| X | Тип указуемого. |

| Параметр | Тип | Описание |
| --- | --- | --- |
| p | X * | Необработанный указатель на объект. |

### ReturnValue

Разделяемый умный указатель на объект.

## См. также

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
