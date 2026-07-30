---
title: "System::SmartPtr::operator* метод"
linktitle: "operator*"
second_title: "Aspose.Font для C++"
description: "System::SmartPtr::operator* метод. Получает ссылку на указанный объект. Проверяет, что указатель не равен null в C++."
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
* Library [Aspose.Font for C++](../../../)
---
title: System::SmartPtr::operator< метод
linktitle: operator<
второй_заголовок: Aspose.Font для C++
description: 'System::SmartPtr::operator< метод. Обеспечивает семантику сравнения на меньше для класса SmartPtr в C++.'
тип: docs
вес: 2700
url: /cpp/system/smartptr/operator_/
---
## SmartPtr::operator<(SmartPtr\<Y\> const\&) const method


Предоставляет семантику сравнения «меньше» для класса [SmartPtr](../).

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

Истина, если объект, на который ссылается [SmartPtr](../), «меньше» x, и ложь в противном случае.

## См. также

* Class [SmartPtr](../)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## SmartPtr::operator<(Y *) const method


Предоставляет семантику сравнения «меньше» для класса [SmartPtr](../).

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

Истина, если объект, на который ссылается [SmartPtr](../), «меньше» p, и ложь в противном случае.

## См. также

* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
