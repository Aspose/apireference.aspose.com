---
title: "System::Buffer::BlockCopy metodo"
linktitle: "BlockCopy"
second_title: "Aspose.Page per C++"
description: "Metodo System::Buffer::BlockCopy. Interpreta due array tipizzati specificati come array grezzi di byte e copia i dati da uno all'altro in C++."
type: docs
weight: 100
url: /it/cpp/system/buffer/blockcopy/
---
## Buffer::BlockCopy(const SharedPtr\<Array\<TSrc\>\>\&, int, const SharedPtr\<Array\<TDst\>\>\&, int, int) method


Interpreta due array tipizzati specificati come array grezzi di byte e copia i dati da uno all'altro.

```cpp
template<typename TSrc,typename TDst> static void System::Buffer::BlockCopy(const SharedPtr<Array<TSrc>> &src, int srcOffset, const SharedPtr<Array<TDst>> &dst, int dstOffset, int count)
```


| Parametro | Descrizione |
| --- | --- |
| TSrc | Il tipo di elementi dell'array di origine |
| TDst | Il tipo di elementi dell'array di destinazione |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| src | const SharedPtr\<Array\<TSrc\>\>\& | L'array di origine |
| srcOffset | int | Un offset di byte nell'array di origine in cui inizia la copia |
| dst | const SharedPtr\<Array\<TDst\>\>\& | L'array di destinazione |
| dstOffset | int | Un offset di byte nell'array di destinazione in cui iniziare l'inserimento dei dati |
| count | int | Il numero di byte da copiare |

## Vedi anche

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::BlockCopy(const SharedPtr\<Array\<TSrc\>\>\&, int, const System::Details::ArrayView\<TDst\>\&, int, int) method


Interpreta due array tipizzati specificati come array grezzi di byte e copia i dati da uno all'altro.

```cpp
template<typename TSrc,typename TDst> static void System::Buffer::BlockCopy(const SharedPtr<Array<TSrc>> &src, int srcOffset, const System::Details::ArrayView<TDst> &dst, int dstOffset, int count)
```


| Parametro | Descrizione |
| --- | --- |
| TSrc | Il tipo di elementi dell'array di origine |
| TDst | Il tipo di elementi della vista dell'array di destinazione |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| src | const SharedPtr\<Array\<TSrc\>\>\& | L'array di origine |
| srcOffset | int | Un offset di byte nell'array di origine in cui inizia la copia |
| dst | const System::Details::ArrayView\<TDst\>\& | La vista dell'array di destinazione |
| dstOffset | int | Un offset di byte nella vista dell'array di destinazione a cui iniziare l'inserimento dei dati |
| count | int | Il numero di byte da copiare |

## Vedi anche

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::BlockCopy(const SharedPtr\<Array\<TSrc\>\>\&, int, const System::Details::StackArray\<TDst, ND\>\&, int, int) method


Interpreta due array tipizzati specificati come array grezzi di byte e copia i dati da uno all'altro.

```cpp
template<typename TSrc,typename TDst,std::size_t> static void System::Buffer::BlockCopy(const SharedPtr<Array<TSrc>> &src, int srcOffset, const System::Details::StackArray<TDst, ND> &dst, int dstOffset, int count)
```


| Parametro | Descrizione |
| --- | --- |
| TSrc | Il tipo di elementi dell'array di origine |
| TDst | Il tipo di elementi dell'array stack di destinazione |
| ND | La dimensione dell'array stack di destinazione |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| src | const SharedPtr\<Array\<TSrc\>\>\& | L'array di origine |
| srcOffset | int | Un offset di byte nell'array di origine in cui inizia la copia |
| dst | const System::Details::StackArray\<TDst, ND\>\& | L'array stack di destinazione |
| dstOffset | int | Un offset di byte nell'array stack di destinazione a cui iniziare l'inserimento dei dati |
| count | int | Il numero di byte da copiare |

## Vedi anche

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::BlockCopy(const System::Details::ArrayView\<TSrc\>\&, int, const SharedPtr\<Array\<TDst\>\>\&, int, int) method


Interpreta due array tipizzati specificati come array grezzi di byte e copia i dati da uno all'altro.

```cpp
template<typename TSrc,typename TDst> static void System::Buffer::BlockCopy(const System::Details::ArrayView<TSrc> &src, int srcOffset, const SharedPtr<Array<TDst>> &dst, int dstOffset, int count)
```


| Parametro | Descrizione |
| --- | --- |
| TSrc | Il tipo di elementi della vista dell'array sorgente |
| TDst | Il tipo di elementi dell'array di destinazione |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| src | const System::Details::ArrayView\<TSrc\>\& | La vista dell'array sorgente |
| srcOffset | int | Un offset di byte nella vista dell'array sorgente a cui inizia la copia |
| dst | const SharedPtr\<Array\<TDst\>\>\& | L'array di destinazione |
| dstOffset | int | Un offset di byte nell'array di destinazione in cui iniziare l'inserimento dei dati |
| count | int | Il numero di byte da copiare |

## Vedi anche

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::BlockCopy(const System::Details::ArrayView\<TSrc\>\&, int, const System::Details::ArrayView\<TDst\>\&, int, int) method


Interpreta due array tipizzati specificati come array grezzi di byte e copia i dati da uno all'altro.

```cpp
template<typename TSrc,typename TDst> static void System::Buffer::BlockCopy(const System::Details::ArrayView<TSrc> &src, int srcOffset, const System::Details::ArrayView<TDst> &dst, int dstOffset, int count)
```


| Parametro | Descrizione |
| --- | --- |
| TSrc | Il tipo di elementi della vista dell'array sorgente |
| TDst | Il tipo di elementi della vista dell'array di destinazione |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| src | const System::Details::ArrayView\<TSrc\>\& | La vista dell'array sorgente |
| srcOffset | int | Un offset di byte nella vista dell'array sorgente a cui inizia la copia |
| dst | const System::Details::ArrayView\<TDst\>\& | La vista dell'array di destinazione |
| dstOffset | int | Un offset di byte nella vista dell'array di destinazione a cui iniziare l'inserimento dei dati |
| count | int | Il numero di byte da copiare |

## Vedi anche

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::BlockCopy(const System::Details::StackArray\<TSrc, NS\>\&, int, const SharedPtr\<Array\<TDst\>\>\&, int, int) method


Interpreta due array tipizzati specificati come array grezzi di byte e copia i dati da uno all'altro.

```cpp
template<typename TSrc,std::size_t,typename TDst> static void System::Buffer::BlockCopy(const System::Details::StackArray<TSrc, NS> &src, int srcOffset, const SharedPtr<Array<TDst>> &dst, int dstOffset, int count)
```


| Parametro | Descrizione |
| --- | --- |
| TSrc | Il tipo di elementi dell'array stack sorgente |
| NS | La dimensione dell'array stack sorgente |
| TDst | Il tipo di elementi dell'array di destinazione |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| src | const System::Details::StackArray\<TSrc, NS\>\& | L'array stack sorgente |
| srcOffset | int | Un offset di byte nell'array stack sorgente a cui inizia la copia |
| dst | const SharedPtr\<Array\<TDst\>\>\& | L'array di destinazione |
| dstOffset | int | Un offset di byte nell'array di destinazione in cui iniziare l'inserimento dei dati |
| count | int | Il numero di byte da copiare |

## Vedi anche

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::BlockCopy(const System::Details::StackArray\<TSrc, NS\>\&, int, const System::Details::StackArray\<TDst, ND\>\&, int, int) method


Interpreta due array tipizzati specificati come array grezzi di byte e copia i dati da uno all'altro.

```cpp
template<typename TSrc,std::size_t,typename TDst,std::size_t> static void System::Buffer::BlockCopy(const System::Details::StackArray<TSrc, NS> &src, int srcOffset, const System::Details::StackArray<TDst, ND> &dst, int dstOffset, int count)
```


| Parametro | Descrizione |
| --- | --- |
| TSrc | Il tipo di elementi dell'array stack sorgente |
| NS | La dimensione dell'array stack sorgente |
| TDst | Il tipo di elementi dell'array stack di destinazione |
| ND | La dimensione dell'array stack di destinazione |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| src | const System::Details::StackArray\<TSrc, NS\>\& | L'array stack sorgente |
| srcOffset | int | Un offset di byte nell'array stack sorgente a cui inizia la copia |
| dst | const System::Details::StackArray\<TDst, ND\>\& | L'array stack di destinazione |
| dstOffset | int | Un offset di byte nell'array stack di destinazione a cui iniziare l'inserimento dei dati |
| count | int | Il numero di byte da copiare |

## Vedi anche

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::BlockCopy(const uint8_t *, int, uint8_t *, int, int) method


Copia un numero specificato di byte dal buffer di origine al buffer di destinazione.

```cpp
static void System::Buffer::BlockCopy(const uint8_t *src, int srcOffset, uint8_t *dst, int dstOffset, int count)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| src | const uint8_t * | Puntatore al buffer sorgente |
| srcOffset | int | Un offset di byte nel buffer sorgente a cui inizia la copia |
| dst | uint8_t * | Puntatore al buffer di destinazione |
| dstOffset | int | Un offset di byte nel buffer di destinazione a cui iniziare l'inserimento dei dati |
| count | int | Il numero di byte da copiare |

## Vedi anche

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
