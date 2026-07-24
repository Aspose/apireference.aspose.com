---
title: "System::SmartPtr::operator* метод"
linktitle: "operator*"
second_title: "Aspose.Page для C++"
description: "System::SmartPtr::operator* метод. Получает ссылку на указанный объект. Утверждает, что указатель не равен null в C++."
type: docs
weight: 2500
url: /ru/cpp/system/smartptr/operator_/
---
## SmartPtr::operator* method


Получает ссылку на указанный объект. Проверяет, что указатель не равен null.

```cpp
Pointee_ & System::SmartPtr<T>::operator*() const
```


### ReturnValue

Ссылка на указанный объект.

## См. также

* Typedef [Pointee_](../pointee_/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
---
заголовок: System::SmartPtr::operator< метод
заголовок ссылки: operator<
second_title: Aspose.Page для C++
description: 'System::SmartPtr::operator< метод. Обеспечивает семантику сравнения «меньше» для класса SmartPtr в C++.'
type: docs
вес: 2700
url: /cpp/system/smartptr/operator_/
---
## SmartPtr::operator<(SmartPtr\<Y\> const\&) const method


Обеспечивает семантику сравнения «меньше» для класса [SmartPtr](../).

```cpp
template<class Y> bool System::SmartPtr<T>::operator<(SmartPtr<Y> const &x) const
```


| Параметр | Описание |
| --- | --- |
| Y | Тип указателя, с которым сравнивается текущий. |

| Параметр | Тип | Описание |
| --- | --- | --- |
| x | SmartPtr\<Y\> const\& | Указатель, с которым сравнивается текущий. |

### ReturnValue

True, если объект, на который ссылается [SmartPtr](../), «меньше» x, иначе false.

## См. также

* Class [SmartPtr](../)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::operator<(Y *) const method


Обеспечивает семантику сравнения «меньше» для класса [SmartPtr](../).

```cpp
template<class Y> bool System::SmartPtr<T>::operator<(Y *p) const
```


| Параметр | Описание |
| --- | --- |
| Y | Тип указателя, с которым сравнивается текущий. |

| Параметр | Тип | Описание |
| --- | --- | --- |
| p | Y * | Указатель, с которым сравнивается текущий. |

### ReturnValue

Истина, если объект, на который ссылается [SmartPtr](../), 'меньше' p, и иначе — ложь.

## См. также

* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
