---
title: "System::SmartPtr::Cast 方法"
linktitle: "Cast"
second_title: "Aspose.Page 适用于 C++"
description: "System::SmartPtr::Cast 方法。将指针在 C++ 中转换为其自身类型。"
type: docs
weight: 400
url: /zh/cpp/system/smartptr/cast/
---
## SmartPtr::Cast() const method


将指针强制转换为其自身类型。

```cpp
template<class Y,typename Check> std::enable_if_t<std::is_same<Y, T>::value, SmartPtr<Y>> System::SmartPtr<T>::Cast() const
```


| Parameter | 描述 |
| --- | --- |
| Y | 指向对象的目标类型。 |
| Check | 标志：如果没有可用的转换则抛出异常。 |

### ReturnValue

始终处于共享模式的已更改类型指针。

## 另见

* Class [SmartPtr](../)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::Cast() const method


使用 static_cast 将指针转换为基类型。

```cpp
template<class Y,typename Check> std::enable_if_t<!std::is_same<Y, T>::value &&std::is_base_of<Y, T>::value, SmartPtr<Y>> System::SmartPtr<T>::Cast() const
```


| Parameter | 描述 |
| --- | --- |
| Y | 指向对象的目标类型。 |
| Check | 标志：如果没有可用的转换则抛出异常。 |

### ReturnValue

始终处于共享模式的已更改类型指针。

## 另见

* Class [SmartPtr](../)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::Cast() const method


使用 dynamic_cast 将指针转换为派生类型。

```cpp
template<class Y,typename Check> std::enable_if_t<Check::value &&!std::is_same<Y, T>::value &&!std::is_base_of<Y, T>::value, SmartPtr<Y>> System::SmartPtr<T>::Cast() const
```


| Parameter | 描述 |
| --- | --- |
| Y | 指向对象的目标类型。 |
| Check | 标志：如果没有可用的转换则抛出异常。 |

### ReturnValue

指针已更改类型且始终处于共享模式。如果没有可用的转换，则抛出 InvalidCastException。

## 另见

* Class [SmartPtr](../)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::Cast() const method


使用 dynamic_cast 将指针转换为派生类型。

```cpp
template<class Y,typename Check> std::enable_if_t<!Check::value &&!std::is_same<Y, T>::value &&!std::is_base_of<Y, T>::value, SmartPtr<Y>> System::SmartPtr<T>::Cast() const
```


| Parameter | 描述 |
| --- | --- |
| Y | 指向对象的目标类型。 |
| Check | 标志：如果没有可用的转换则抛出异常。 |

### ReturnValue

指针已更改类型且始终处于共享模式。如果没有可用的转换，则返回 nullptr。

## 另见

* Class [SmartPtr](../)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
