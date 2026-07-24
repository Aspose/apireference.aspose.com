---
title: "System::Collections::Generic::Dictionary::Dictionary constructor"
linktitle: "Dictionary"
second_title: "Aspose.Page için C++"
description: "System::Collections::Generic::Dictionary::Dictionary constructor. C++'de boş sözlük oluşturur."
type: docs
weight: 100
url: /tr/cpp/system.collections.generic/dictionary/dictionary/
---
## Dictionary::Dictionary() constructor


Boş bir sözlük oluşturur.

```cpp
System::Collections::Generic::Dictionary<TKey, TValue>::Dictionary()
```

## Ayrıca Bakınız

* Class [Dictionary](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## Dictionary::Dictionary(const map_t\&) constructor


Haritadan verileri kopyalar.

```cpp
System::Collections::Generic::Dictionary<TKey, TValue>::Dictionary(const map_t &map)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| harita | const map_t\& | Kopyalanacak verilerin haritası. |

## Ayrıca Bakınız

* Typedef [map_t](../map_t/)
* Class [Dictionary](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## Dictionary::Dictionary(const SharedPtr\<IDictionary\<TKey, TValue\>\>\&) constructor


Kopya yapıcı.

```cpp
System::Collections::Generic::Dictionary<TKey, TValue>::Dictionary(const SharedPtr<IDictionary<TKey, TValue>> &src)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| src | const SharedPtr\<IDictionary\<TKey, TValue\>\>\& | [Dictionary](../) kopyalanacak veri. |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IDictionary](../../idictionary/)
* Class [Dictionary](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## Dictionary::Dictionary(const SharedPtr\<IDictionary\<TKey, TValue\>\>\&, const SharedPtr\<IEqualityComparer\<TKey\>\>\&) constructor


Kopya yapıcı.

```cpp
System::Collections::Generic::Dictionary<TKey, TValue>::Dictionary(const SharedPtr<IDictionary<TKey, TValue>> &src, const SharedPtr<IEqualityComparer<TKey>> &comparer)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| src | const SharedPtr\<IDictionary\<TKey, TValue\>\>\& | Kaynak sözlük. |
| comparer | const SharedPtr\<IEqualityComparer\<TKey\>\>\& | Kullanılacak [Comparer](../../comparer/) nesnesi. |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IDictionary](../../idictionary/)
* Class [IEqualityComparer](../../iequalitycomparer/)
* Class [Dictionary](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## Dictionary::Dictionary(const SharedPtr\<IEqualityComparer\<TKey\>\>\&) constructor


Boş bir sözlük oluşturur.

```cpp
System::Collections::Generic::Dictionary<TKey, TValue>::Dictionary(const SharedPtr<IEqualityComparer<TKey>> &comparer)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| comparer | const SharedPtr\<IEqualityComparer\<TKey\>\>\& | [Comparer](../../comparer/) kullanmak için. |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEqualityComparer](../../iequalitycomparer/)
* Class [Dictionary](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## Dictionary::Dictionary(int) constructor


Önceden ayrılmış sözlük oluşturmayı karşılayan aşırı yükleme; aslında hiçbir tahsis yapmaz.

```cpp
System::Collections::Generic::Dictionary<TKey, TValue>::Dictionary(int capacity)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| kapasite | int | Ayırılacak kapasite; yok sayılır. |

## Ayrıca Bakınız

* Class [Dictionary](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## Dictionary::Dictionary(int, const SharedPtr\<IEqualityComparer\<TKey\>\>\&) constructor


Boş bir sözlük oluşturur.

```cpp
System::Collections::Generic::Dictionary<TKey, TValue>::Dictionary(int capacity, const SharedPtr<IEqualityComparer<TKey>> &comparer)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| capacity | int | [Dictionary](../) oluşturulduktan sonraki kapasite; yok sayılır. |
| comparer | const SharedPtr\<IEqualityComparer\<TKey\>\>\& | [Comparer](../../comparer/) kullanmak için. |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEqualityComparer](../../iequalitycomparer/)
* Class [Dictionary](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
