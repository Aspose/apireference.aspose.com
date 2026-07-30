---
title: "Méthode System::Buffer::BlockCopy"
linktitle: "BlockCopy"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Buffer::BlockCopy. Interprète deux tableaux typés spécifiés comme des tableaux d'octets bruts et copie les données de l'un à l'autre en C++."
type: docs
weight: 100
url: /fr/cpp/system/buffer/blockcopy/
---
## Buffer::BlockCopy(const SharedPtr\<Array\<TSrc\>\>\&, int, const SharedPtr\<Array\<TDst\>\>\&, int, int) method


Interprète deux tableaux typés spécifiés comme des tableaux bruts d'octets et copie les données de l'un à l'autre.

```cpp
template<typename TSrc,typename TDst> static void System::Buffer::BlockCopy(const SharedPtr<Array<TSrc>> &src, int srcOffset, const SharedPtr<Array<TDst>> &dst, int dstOffset, int count)
```


| Paramètre | Description |
| --- | --- |
| TSrc | Le type d'éléments du tableau source |
| TDst | Le type d'éléments du tableau de destination |

| Paramètre | Type | Description |
| --- | --- | --- |
| src | const SharedPtr\<Array\<TSrc\>\>\& | Le tableau source |
| srcOffset | int | Un décalage d'octet dans le tableau source à partir duquel la copie commence |
| dst | const SharedPtr\<Array\<TDst\>\>\& | Le tableau de destination |
| dstOffset | int | Un décalage d'octet dans le tableau de destination à partir duquel commencer l'insertion de données |
| count | int | Le nombre d'octets à copier |

## Voir aussi

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Buffer::BlockCopy(const SharedPtr\<Array\<TSrc\>\>\&, int, const System::Details::ArrayView\<TDst\>\&, int, int) method


Interprète deux tableaux typés spécifiés comme des tableaux bruts d'octets et copie les données de l'un à l'autre.

```cpp
template<typename TSrc,typename TDst> static void System::Buffer::BlockCopy(const SharedPtr<Array<TSrc>> &src, int srcOffset, const System::Details::ArrayView<TDst> &dst, int dstOffset, int count)
```


| Paramètre | Description |
| --- | --- |
| TSrc | Le type d'éléments du tableau source |
| TDst | Le type d'éléments de la vue du tableau de destination |

| Paramètre | Type | Description |
| --- | --- | --- |
| src | const SharedPtr\<Array\<TSrc\>\>\& | Le tableau source |
| srcOffset | int | Un décalage d'octet dans le tableau source à partir duquel la copie commence |
| dst | const System::Details::ArrayView\<TDst\>\& | La vue du tableau de destination |
| dstOffset | int | Un décalage d'octet dans la vue du tableau de destination à partir duquel commencer l'insertion de données |
| count | int | Le nombre d'octets à copier |

## Voir aussi

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Buffer::BlockCopy(const SharedPtr\<Array\<TSrc\>\>\&, int, const System::Details::StackArray\<TDst, ND\>\&, int, int) method


Interprète deux tableaux typés spécifiés comme des tableaux bruts d'octets et copie les données de l'un à l'autre.

```cpp
template<typename TSrc,typename TDst,std::size_t> static void System::Buffer::BlockCopy(const SharedPtr<Array<TSrc>> &src, int srcOffset, const System::Details::StackArray<TDst, ND> &dst, int dstOffset, int count)
```


| Paramètre | Description |
| --- | --- |
| TSrc | Le type d'éléments du tableau source |
| TDst | Le type d'éléments du tableau de pile de destination |
| ND | La taille du tableau de pile de destination |

| Paramètre | Type | Description |
| --- | --- | --- |
| src | const SharedPtr\<Array\<TSrc\>\>\& | Le tableau source |
| srcOffset | int | Un décalage d'octet dans le tableau source à partir duquel la copie commence |
| dst | const System::Details::StackArray\<TDst, ND\>\& | Le tableau de pile de destination |
| dstOffset | int | Un décalage d'octet dans le tableau de pile de destination à partir duquel commencer l'insertion de données |
| count | int | Le nombre d'octets à copier |

## Voir aussi

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Buffer::BlockCopy(const System::Details::ArrayView\<TSrc\>\&, int, const SharedPtr\<Array\<TDst\>\>\&, int, int) method


Interprète deux tableaux typés spécifiés comme des tableaux bruts d'octets et copie les données de l'un à l'autre.

```cpp
template<typename TSrc,typename TDst> static void System::Buffer::BlockCopy(const System::Details::ArrayView<TSrc> &src, int srcOffset, const SharedPtr<Array<TDst>> &dst, int dstOffset, int count)
```


| Paramètre | Description |
| --- | --- |
| TSrc | Le type d'éléments de la vue du tableau source |
| TDst | Le type d'éléments du tableau de destination |

| Paramètre | Type | Description |
| --- | --- | --- |
| src | const System::Details::ArrayView\<TSrc\>\& | La vue du tableau source |
| srcOffset | int | Un décalage d'octet dans la vue du tableau source tho à partir duquel la copie commence |
| dst | const SharedPtr\<Array\<TDst\>\>\& | Le tableau de destination |
| dstOffset | int | Un décalage d'octet dans le tableau de destination à partir duquel commencer l'insertion de données |
| count | int | Le nombre d'octets à copier |

## Voir aussi

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Buffer::BlockCopy(const System::Details::ArrayView\<TSrc\>\&, int, const System::Details::ArrayView\<TDst\>\&, int, int) method


Interprète deux tableaux typés spécifiés comme des tableaux bruts d'octets et copie les données de l'un à l'autre.

```cpp
template<typename TSrc,typename TDst> static void System::Buffer::BlockCopy(const System::Details::ArrayView<TSrc> &src, int srcOffset, const System::Details::ArrayView<TDst> &dst, int dstOffset, int count)
```


| Paramètre | Description |
| --- | --- |
| TSrc | Le type d'éléments de la vue du tableau source |
| TDst | Le type d'éléments de la vue du tableau de destination |

| Paramètre | Type | Description |
| --- | --- | --- |
| src | const System::Details::ArrayView\<TSrc\>\& | La vue du tableau source |
| srcOffset | int | Un décalage d'octet dans la vue du tableau source tho à partir duquel la copie commence |
| dst | const System::Details::ArrayView\<TDst\>\& | La vue du tableau de destination |
| dstOffset | int | Un décalage d'octet dans la vue du tableau de destination à partir duquel commencer l'insertion de données |
| count | int | Le nombre d'octets à copier |

## Voir aussi

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Buffer::BlockCopy(const System::Details::StackArray\<TSrc, NS\>\&, int, const SharedPtr\<Array\<TDst\>\>\&, int, int) method


Interprète deux tableaux typés spécifiés comme des tableaux bruts d'octets et copie les données de l'un à l'autre.

```cpp
template<typename TSrc,std::size_t,typename TDst> static void System::Buffer::BlockCopy(const System::Details::StackArray<TSrc, NS> &src, int srcOffset, const SharedPtr<Array<TDst>> &dst, int dstOffset, int count)
```


| Paramètre | Description |
| --- | --- |
| TSrc | Le type d'éléments du tableau de pile source |
| NS | La taille du tableau de pile source |
| TDst | Le type d'éléments du tableau de destination |

| Paramètre | Type | Description |
| --- | --- | --- |
| src | const System::Details::StackArray\<TSrc, NS\>\& | Le tableau de pile source |
| srcOffset | int | Un décalage d'octet dans le tableau de pile source tho à partir duquel la copie commence |
| dst | const SharedPtr\<Array\<TDst\>\>\& | Le tableau de destination |
| dstOffset | int | Un décalage d'octet dans le tableau de destination à partir duquel commencer l'insertion de données |
| count | int | Le nombre d'octets à copier |

## Voir aussi

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Buffer::BlockCopy(const System::Details::StackArray\<TSrc, NS\>\&, int, const System::Details::StackArray\<TDst, ND\>\&, int, int) method


Interprète deux tableaux typés spécifiés comme des tableaux bruts d'octets et copie les données de l'un à l'autre.

```cpp
template<typename TSrc,std::size_t,typename TDst,std::size_t> static void System::Buffer::BlockCopy(const System::Details::StackArray<TSrc, NS> &src, int srcOffset, const System::Details::StackArray<TDst, ND> &dst, int dstOffset, int count)
```


| Paramètre | Description |
| --- | --- |
| TSrc | Le type d'éléments du tableau de pile source |
| NS | La taille du tableau de pile source |
| TDst | Le type d'éléments du tableau de pile de destination |
| ND | La taille du tableau de pile de destination |

| Paramètre | Type | Description |
| --- | --- | --- |
| src | const System::Details::StackArray\<TSrc, NS\>\& | Le tableau de pile source |
| srcOffset | int | Un décalage d'octet dans le tableau de pile source tho à partir duquel la copie commence |
| dst | const System::Details::StackArray\<TDst, ND\>\& | Le tableau de pile de destination |
| dstOffset | int | Un décalage d'octet dans le tableau de pile de destination à partir duquel commencer l'insertion de données |
| count | int | Le nombre d'octets à copier |

## Voir aussi

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Buffer::BlockCopy(const uint8_t *, int, uint8_t *, int, int) method


Copie un nombre spécifié d'octets du tampon source vers le tampon de destination.

```cpp
static void System::Buffer::BlockCopy(const uint8_t *src, int srcOffset, uint8_t *dst, int dstOffset, int count)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| src | const uint8_t * | Pointeur vers le tampon source |
| srcOffset | int | Un décalage d'octet dans le tampon source à partir duquel la copie commence |
| dst | uint8_t * | Pointeur vers le tampon de destination |
| dstOffset | int | Un décalage d'octet dans le tampon de destination à partir duquel commencer l'insertion de données |
| count | int | Le nombre d'octets à copier |

## Voir aussi

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
