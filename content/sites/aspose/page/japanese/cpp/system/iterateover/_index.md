---
title: "System::IterateOver メソッド"
linktitle: "反復処理"
second_title: "C++ 用 Aspose.Page"
description: "System::IterateOver メソッド。 この関数プロパティは enumerable（または iterable）オブジェクトをラップし、範囲ベースの for ループで使用できるようにします。 これは C++ におけるデフォルトのターゲット型を持つ Enumerable 用のオーバーロードです。"
type: docs
weight: 23100
url: /ja/cpp/system/iterateover/
---
## System::IterateOver(const Enumerable *) method


この関数プロパティは enumerable（または iterable）オブジェクトをラップし、範囲ベースの for ループで使用できるようにします。 これはデフォルトのターゲット型を持つ Enumerable 用のオーバーロードです。

```cpp
template<typename Enumerable> std::enable_if_t<!IsSmartPtr<Enumerable>::value, Details::EnumeratorAdapter<Enumerable, Details::ValueTypeOfEnumerable<Enumerable>, Enumerable *>> System::IterateOver(const Enumerable *enumerable)
```


| パラメーター | 説明 |
| --- | --- |
| Enumerable | ラップされたオブジェクトの型 |

## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::IterateOver(const Enumerable *) method


この関数プロパティは enumerable（または iterable）オブジェクトをラップし、範囲ベースの for ループで使用できるようにします。 これは begin()、end() メソッドがない Enumerable 用のオーバーロードで、ターゲット型引数を指定します（例: (auto& value : IterateOver<SomeType>(enumerable))）。

```cpp
template<typename T,typename Enumerable> std::enable_if_t<!IsSmartPtr<Enumerable>::value, Details::EnumeratorAdapter<Enumerable, T, Enumerable *>> System::IterateOver(const Enumerable *enumerable)
```


| パラメーター | 説明 |
| --- | --- |
| T | ターゲット型。イテレータから返される必要があります。 |
| Enumerable | ラップされたオブジェクトの型 |

## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::IterateOver(System::SmartPtr\<Enumerable\>) method


この関数プロパティは enumerable（または iterable）オブジェクトをラップし、範囲ベースの for ループで使用できるようにします。 これは begin()、end() メソッドがない Enumerable 用のオーバーロードで、ターゲット型引数を指定します（例: (auto& value : IterateOver<SomeType>(enumerable))）。

```cpp
template<typename T,typename Enumerable> std::enable_if_t<!Details::IsIterable<Enumerable>::value, Details::EnumeratorAdapter<Enumerable, T>> System::IterateOver(System::SmartPtr<Enumerable> enumerable)
```


| パラメーター | 説明 |
| --- | --- |
| T | ターゲット型。イテレータから返される必要があります。 |
| Enumerable | ラップされたオブジェクトの型 |

## 参照

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::IterateOver(System::SmartPtr\<Enumerable\>) method


この関数プロパティは enumerable（または iterable）オブジェクトをラップし、範囲ベースの for ループで使用できるようにします。 これは begin()、end() メソッドがない Enumerable 用のオーバーロードで、デフォルトのターゲット型引数を使用します（例: (auto& value : IterateOver(enumerable))）。以下の C# コードに相当します：foreach (var value in enumerable)。

```cpp
template<typename Enumerable> std::enable_if_t<!Details::IsIterable<Enumerable>::value, Details::EnumeratorAdapter<Enumerable>> System::IterateOver(System::SmartPtr<Enumerable> enumerable)
```


| パラメーター | 説明 |
| --- | --- |
| Enumerable | ラップされたオブジェクトの型 |

## 参照

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::IterateOver(System::SmartPtr\<Enumerable\>) method


この関数プロパティは enumerable（または iterable）オブジェクトをラップし、範囲ベースの for ループで使用できるようにします。 これは begin()、end() メソッドを持つ Enumerable 用のオーバーロードで、デフォルトのターゲット型引数を使用します（例: (auto& value : IterateOver(enumerable))）。

```cpp
template<typename Enumerable> std::enable_if_t<Details::IsIterable<Enumerable>::value, System::SmartPtr<Enumerable>> System::IterateOver(System::SmartPtr<Enumerable> enumerable)
```


| パラメーター | 説明 |
| --- | --- |
| Enumerable | ラップされたオブジェクトの型 |

## 参照

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::IterateOver(System::SmartPtr\<Enumerable\>) method


この関数プロパティは enumerable（または iterable）オブジェクトをラップし、範囲ベースの for ループで使用できるようにします。 これは begin()、end() メソッドを持つ Enumerable 用のオーバーロードで、ターゲット型がイテレータの元の value_type と同じです。

```cpp
template<typename T,typename Enumerable> std::enable_if_t<Details::IsIterable<Enumerable>::value &&std::is_same<typename Details::ReturnTypeTrait<T>::ReturnType, Details::IterableValueType<Enumerable>>::value, System::SmartPtr<Enumerable>> System::IterateOver(System::SmartPtr<Enumerable> enumerable)
```


| パラメーター | 説明 |
| --- | --- |
| Enumerable | ラップされたオブジェクトの型 |
| T | イテレータから返される必要があるターゲット型 |

## 参照

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::IterateOver(System::SmartPtr\<Enumerable\>) method


この関数プロパティは enumerable（または iterable）オブジェクトをラップし、範囲ベースの for ループで使用できるようにします。 これは begin()、end() メソッドを持つ Enumerable 用のオーバーロードで、異なるターゲット型とイテレータの元の value_type を使用します。

```cpp
template<typename T,typename Enumerable> std::enable_if_t<Details::IsIterable<Enumerable>::value &&!std::is_same<typename Details::ReturnTypeTrait<T>::ReturnType, Details::IterableValueType<Enumerable>>::value, Details::CppIteratorAdapter<Enumerable, T>> System::IterateOver(System::SmartPtr<Enumerable> enumerable)
```


| パラメーター | 説明 |
| --- | --- |
| Enumerable | ラップされたオブジェクトの型 |
| T | イテレータから返される必要があるターゲット型 |

## 参照

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
