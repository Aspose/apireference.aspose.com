---
title: "System::Collections ad alanı"
linktitle: "System::Collections"
second_title: "Aspose.Font için C++"
description: "C++'ta System::Collections ad alanını nasıl kullanılır."
type: docs
weight: 2600
url: /tr/cpp/system.collections/
---



## Sınıflar

| Sınıf | Açıklama |
| --- | --- |
| [BitArray](./bitarray/) | [Array](../system/array/) indeksle adreslenebilen bit dizisi. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../system/makeobject/) fonksiyonu kullanılarak allocate edilmelidir. Bu tipin bir örneğini yığına (stack) ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya assert hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin. |
| [BitArrayPtr](./bitarrayptr/) | [BitArray](./bitarray/) işaretçisi. Bu tip, diğer nesnenin silinmesini yönetmek için bir işaretçidir. Yığına (stack) allocate edilmeli ve fonksiyonlara değer olarak ya da const referansla geçirilmelidir. |
| [CollectionBase](./collectionbase/) | Güçlü tiplenmiş bir koleksiyon için soyut bir temel sınıf sağlar. |
| [ICollection](./icollection/) | Genel olmayan koleksiyon arayüzünü tanımlar. |
| [IEnumerable](./ienumerable/) | [IEnumerable](./ienumerable/) yinelemeye (enumerate) izin verilen tüm genel olmayan koleksiyonların temel arayüzüdür. |
| [IEnumerator](./ienumerator/) | Bazı öğeler üzerinde yineleme yapmak için kullanılabilen bir enumerator arayüzü. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../system/makeobject/) fonksiyonu kullanılarak allocate edilmelidir. Bu tipin bir örneğini yığına (stack) ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya assert hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin. |
| [IEnumeratorImplRefType](./ienumeratorimplreftype/) | Genel Iterator [IEnumeratorImplRefType](./ienumeratorimplreftype/) üzerine genel olmayan bir [IEnumerator](./ienumerator/) uygulaması oluşturan sarmalayıcı - Referans Tipleri için sarmalayıcı. |
| [IEnumeratorImplValueType](./ienumeratorimplvaluetype/) | Genel Iterator [IEnumeratorImplRefType](./ienumeratorimplreftype/) üzerine genel olmayan bir [IEnumerator](./ienumerator/) uygulaması oluşturan sarmalayıcı - Değer Tipleri için sarmalayıcı. |
| [IEqualityComparer](./iequalitycomparer/) |  |
| [IList](./ilist/) | [IList](./ilist/) indeksle bireysel olarak erişilebilen nesnelerden oluşan genel olmayan bir koleksiyonu temsil eder. |
| [IListImplRefType](./ilistimplreftype/) | Referans tipleri için [System::Collections::Generic::List](../system.collections.generic/list/) nesnesi üzerinde [System::Collections::IList](./ilist/) arayüzünü uygulayan bir stub. |
| [IListImplValueType](./ilistimplvaluetype/) | Değer tipleri için [System::Collections::Generic::List](../system.collections.generic/list/) nesnesi üzerinde [System::Collections::IList](./ilist/) arayüzünü uygulayan bir stub. |
| [IListWrapper](./ilistwrapper/) | Genel koleksiyondan genel olmayan koleksiyona dönüşümü destekleyen arayüz. |
| [Invalidatable](./invalidatable/) | Descendant'larının durumunu [InvalidatableTracker](./invalidatabletracker/) nesneleri aracılığıyla izlemeyi mümkün kılan sınıf. |
| [InvalidatableTracker](./invalidatabletracker/) | [Invalidatable](./invalidatable/) nesnelerinin izleyicilerini uygulayan sınıf. |
