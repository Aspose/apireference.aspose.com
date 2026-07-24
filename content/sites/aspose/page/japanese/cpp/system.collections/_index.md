---
title: "System::Collections 名前空間"
linktitle: "System::Collections"
second_title: "C++ 用 Aspose.Page"
description: "C++ で System::Collections 名前空間を使用する方法。"
type: docs
weight: 2200
url: /ja/cpp/system.collections/
---



## クラス

| クラス | 説明 |
| --- | --- |
| [BitArray](./bitarray/) | [Array](../system/array/) はインデックスでアクセスできるビットの配列です。このクラスのオブジェクトは、[System::MakeObject()](../system/makeobject/) 関数を使用してのみ割り当てるべきです。この型のインスタンスをスタック上で作成したり operator new を使用したりしないでください。そうするとランタイムエラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として使用してください。 |
| [BitArrayPtr](./bitarrayptr/) | [BitArray](./bitarray/) へのポインタ。この型は他のオブジェクトの削除を管理するポインタです。スタック上に割り当て、値渡しまたは const 参照で関数に渡すべきです。 |
| [CollectionBase](./collectionbase/) | 強く型付けされたコレクションの抽象基底クラスを提供します。 |
| [ICollection](./icollection/) | 非ジェネリックコレクションインターフェイスを定義します。 |
| [IEnumerable](./ienumerable/) | [IEnumerable](./ienumerable/) は、列挙可能なすべての非ジェネリックコレクションの基本インターフェイスです。 |
| [IEnumerator](./ienumerator/) | いくつかの要素を反復処理するために使用できる列挙子のインターフェイス。このクラスのオブジェクトは、[System::MakeObject()](../system/makeobject/) 関数を使用してのみ割り当てるべきです。この型のインスタンスをスタック上で作成したり operator new を使用したりしないでください。そうするとランタイムエラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として使用してください。 |
| [IEnumeratorImplRefType](./ienumeratorimplreftype/) | ジェネリックイテレータ [IEnumeratorImplRefType](./ienumeratorimplreftype/) 上に非ジェネリック [IEnumerator](./ienumerator/) 実装を作成するラッパー - 参照型用ラッパー。 |
| [IEnumeratorImplValueType](./ienumeratorimplvaluetype/) | ジェネリックイテレータ [IEnumeratorImplRefType](./ienumeratorimplreftype/) 上に非ジェネリック [IEnumerator](./ienumerator/) 実装を作成するラッパー - 値型用ラッパー。 |
| [IEqualityComparer](./iequalitycomparer/) |  |
| [IList](./ilist/) | [IList](./ilist/) は、インデックスで個別にアクセスできるオブジェクトの非ジェネリックコレクションを表します。 |
| [IListImplRefType](./ilistimplreftype/) | [System::Collections::IList](./ilist/) インターフェイスを [System::Collections::Generic::List](../system.collections.generic/list/) オブジェクト上で実装するスタブ。参照型向けの実装です。 |
| [IListImplValueType](./ilistimplvaluetype/) | [System::Collections::IList](./ilist/) インターフェイスを [System::Collections::Generic::List](../system.collections.generic/list/) オブジェクト上で実装するスタブ。値型向けの実装です。 |
| [IListWrapper](./ilistwrapper/) | ジェネリックコレクションから非ジェネリックコレクションへのキャストをサポートするインターフェイス。 |
| [Invalidatable](./invalidatable/) | 子孫の状態を [InvalidatableTracker](./invalidatabletracker/) オブジェクトを通じて追跡できるようにするクラス。 |
| [InvalidatableTracker](./invalidatabletracker/) | [Invalidatable](./invalidatable/) オブジェクトのトラッカーを実装するクラス。 |
