---
title: "System::Collections::Generic::Dictionary::Dictionary 생성자"
linktitle: "Dictionary"
second_title: "C++용 Aspose.Page"
description: "System::Collections::Generic::Dictionary::Dictionary 생성자. C++에서 빈 사전을 생성합니다."
type: docs
weight: 100
url: /ko/cpp/system.collections.generic/dictionary/dictionary/
---
## Dictionary::Dictionary() constructor


빈 사전을 생성합니다.

```cpp
System::Collections::Generic::Dictionary<TKey, TValue>::Dictionary()
```

## 또 보기

* Class [Dictionary](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## Dictionary::Dictionary(const map_t\&) constructor


맵에서 데이터를 복사합니다.

```cpp
System::Collections::Generic::Dictionary<TKey, TValue>::Dictionary(const map_t &map)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| map | const map_t\& | 데이터를 복사할 Map. |

## 또 보기

* Typedef [map_t](../map_t/)
* Class [Dictionary](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## Dictionary::Dictionary(const SharedPtr\<IDictionary\<TKey, TValue\>\>\&) constructor


복사 생성자.

```cpp
System::Collections::Generic::Dictionary<TKey, TValue>::Dictionary(const SharedPtr<IDictionary<TKey, TValue>> &src)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| src | const SharedPtr\<IDictionary\<TKey, TValue\>\>\& | [Dictionary](../)에서 데이터를 복사합니다. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IDictionary](../../idictionary/)
* Class [Dictionary](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## Dictionary::Dictionary(const SharedPtr\<IDictionary\<TKey, TValue\>\>\&, const SharedPtr\<IEqualityComparer\<TKey\>\>\&) constructor


복사 생성자.

```cpp
System::Collections::Generic::Dictionary<TKey, TValue>::Dictionary(const SharedPtr<IDictionary<TKey, TValue>> &src, const SharedPtr<IEqualityComparer<TKey>> &comparer)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| src | const SharedPtr\<IDictionary\<TKey, TValue\>\>\& | 원본 사전. |
| comparer | const SharedPtr\<IEqualityComparer\<TKey\>\>\& | 사용할 [Comparer](../../comparer/) 객체. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IDictionary](../../idictionary/)
* Class [IEqualityComparer](../../iequalitycomparer/)
* Class [Dictionary](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## Dictionary::Dictionary(const SharedPtr\<IEqualityComparer\<TKey\>\>\&) constructor


빈 사전을 생성합니다.

```cpp
System::Collections::Generic::Dictionary<TKey, TValue>::Dictionary(const SharedPtr<IEqualityComparer<TKey>> &comparer)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| comparer | const SharedPtr\<IEqualityComparer\<TKey\>\>\& | [Comparer](../../comparer/) 사용. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEqualityComparer](../../iequalitycomparer/)
* Class [Dictionary](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## Dictionary::Dictionary(int) constructor


미리 할당된 사전을 생성하는 것에 해당하는 오버로드; 실제로는 할당을 수행하지 않습니다.

```cpp
System::Collections::Generic::Dictionary<TKey, TValue>::Dictionary(int capacity)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 용량 | int | 할당할 용량; 무시됩니다. |

## 또 보기

* Class [Dictionary](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## Dictionary::Dictionary(int, const SharedPtr\<IEqualityComparer\<TKey\>\>\&) constructor


빈 사전을 생성합니다.

```cpp
System::Collections::Generic::Dictionary<TKey, TValue>::Dictionary(int capacity, const SharedPtr<IEqualityComparer<TKey>> &comparer)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| capacity | int | 생성 후 [Dictionary](../) 용량; 무시됩니다. |
| comparer | const SharedPtr\<IEqualityComparer\<TKey\>\>\& | [Comparer](../../comparer/) 사용. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEqualityComparer](../../iequalitycomparer/)
* Class [Dictionary](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
