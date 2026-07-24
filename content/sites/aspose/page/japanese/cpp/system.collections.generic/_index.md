---
title: "System::Collections::Generic 名前空間"
linktitle: "System::Collections::Generic"
second_title: "C++ 用 Aspose.Page"
description: "C++ で System::Collections::Generic 名前空間を使用する方法。"
type: docs
weight: 2400
url: /ja/cpp/system.collections.generic/
---



## クラス

| クラス | 説明 |
| --- | --- |
| [_KeyCollection](./_keycollection/) | [Dictionary](./dictionary/) のキーのコレクションです。コレクションを参照し、何もコピーしません。このクラスのオブジェクトは [System::MakeObject()](../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。ランタイムエラーやアサーション失敗の原因となります。常にこのクラスを [System::SmartPtr](../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として使用してください。 |
| [_KeyList](./_keylist/) | 辞書のキーのリストを実装します。このクラスのオブジェクトは [System::MakeObject()](../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new でインスタンスを作成しないでください。ランタイムエラーやアサーション失敗の原因になります。常にこのクラスを [System::SmartPtr](../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として使用してください。 |
| [_ValueCollection](./_valuecollection/) | [Dictionary](./dictionary/) の値のコレクションです。コレクションを参照し、何もコピーしません。このクラスのオブジェクトは [System::MakeObject()](../system/makeobject/) 関数でのみ割り当てるべきです。スタック上や operator new でインスタンスを作成しないでください。ランタイムエラーやアサーション失敗につながります。常にこのクラスを [System::SmartPtr](../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として使用してください。 |
| [_ValueList](./_valuelist/) | 辞書の値のリストを実装します。このクラスのオブジェクトは [System::MakeObject()](../system/makeobject/) 関数でのみ割り当てるべきです。スタック上や operator new でインスタンスを作成しないでください。ランタイムエラーやアサーション失敗の原因になります。常にこのクラスを [System::SmartPtr](../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として使用してください。 |
| [BaseDictionary](./basedictionary/) | さまざまな辞書類似データ構造（例: [Dictionary](./dictionary/)、[SortedDictionary](./sorteddictionary/)）の共通コードを実装します。コンテナを定義する際の継承以外で直接使用すべきではありません。このクラスのオブジェクトは [System::MakeObject()](../system/makeobject/) 関数でのみ割り当てるべきです。スタック上や operator new でインスタンスを作成しないでください。ランタイムエラーやアサーション失敗につながります。常にこのクラスを [System::SmartPtr](../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として使用してください。 |
| [BaseEnumerator](./baseenumerator/) | [Enumerator](./baseset/) の定義で、STL 形式の型を C# 形式で使用できるようにラップします。シーケンシャルイテレータの存在以外、コンテナ構造に対するアサーションは行いません。begin() と end() 関数を使用します。このクラスのオブジェクトは [System::MakeObject()](../system/makeobject/) 関数でのみ割り当てるべきです。スタック上や operator new でインスタンスを作成しないでください。ランタイムエラーやアサーション失敗の原因になります。常にこのクラスを [System::SmartPtr](../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として使用してください。 |
| [BaseKVCollection](./basekvcollection/) | キーまたは値のコレクションに共通するコードを保持します。このクラスのオブジェクトは [System::MakeObject()](../system/makeobject/) 関数でのみ割り当てるべきです。スタック上や operator new でインスタンスを作成しないでください。ランタイムエラーやアサーション失敗につながります。常にこのクラスを [System::SmartPtr](../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として使用してください。 |
| [BaseSet](./baseset/) |  |
| [Comparer](./comparer/) | [System.Collections.Generic.IComparer](./icomparer/) ジェネリックインターフェイスの実装のための基底クラスを提供します。 |
| [DefaultComparer](./defaultcomparer/) | デフォルトの比較クラスです。operator < と operator == を使用して値を比較します。このクラスのオブジェクトは [System::MakeObject()](../system/makeobject/) 関数でのみ割り当てるべきです。スタック上や operator new でインスタンスを作成しないでください。ランタイムエラーやアサーション失敗の原因になります。常にこのクラスを [System::SmartPtr](../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として使用してください。 |
| [Dictionary](./dictionary/) | [Dictionary](./dictionary/) クラスの前方宣言です。 |
| [DictionaryIterator](./dictionaryiterator/) | [Dictionary](./dictionary/) のイテレータで、[KeyValuePair](./keyvaluepair/) 表記を提供します。 |
| [DictionaryPtr](./dictionaryptr/) | [Dictionary](./dictionary/) のポインタクラスで、演算子オーバーロードを備えています。この型は他のオブジェクトの削除を管理するポインタです。スタック上で割り当て、値渡しまたは const 参照で関数に渡すべきです。 |
| [EnumerableExt](./enumerableext/) |  |
| [EnumeratorWrapperIterator](./enumeratorwrapperiterator/) | 事前に作成された列挙子をラップし、すべての呼び出しをそれに転送するイテレータです。 |
| [HashDictionary](./hashdictionary/) | [HashDictionary](./hashdictionary/) クラスのスタブです（現在実装されていません）。このクラスのオブジェクトは [System::MakeObject()](../system/makeobject/) 関数でのみ割り当てるべきです。スタック上や operator new でインスタンスを作成しないでください。ランタイムエラーやアサーション失敗の原因になります。常にこのクラスを [System::SmartPtr](../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として使用してください。 |
| [HashSet](./hashset/) | [HashSet](./hashset/) クラスの前方宣言です。 |
| [HashSetPtr](./hashsetptr/) | [HashSet](./hashset/) への参照を保持するポインタです。この型は他のオブジェクトの削除を管理するポインタで、スタック上で割り当て、値渡しまたは const 参照で関数に渡すべきです。 |
| [ICollection](./icollection/) | 要素のコレクションのインターフェイスです。このクラスのオブジェクトは [System::MakeObject()](../system/makeobject/) 関数でのみ割り当てるべきです。スタック上や operator new でインスタンスを作成しないでください。ランタイムエラーやアサーション失敗の原因になります。常にこのクラスを [System::SmartPtr](../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として使用してください。 |
| [IComparer](./icomparer/) | 二つのオブジェクトを大なり・等しい・小なりの観点で比較するインターフェイスです。このクラスのオブジェクトは [System::MakeObject()](../system/makeobject/) 関数でのみ割り当てるべきです。スタック上や operator new でインスタンスを作成しないでください。ランタイムエラーやアサーション失敗につながります。常にこのクラスを [System::SmartPtr](../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として使用してください。 |
| [IDictionary](./idictionary/) | 辞書類似コンテナ用のインターフェイスです。このクラスのオブジェクトは [System::MakeObject()](../system/makeobject/) 関数でのみ割り当てるべきです。スタック上や operator new でインスタンスを作成しないでください。ランタイムエラーやアサーション失敗の原因になります。常にこのクラスを [System::SmartPtr](../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として使用してください。 |
| [IEnumerable](./ienumerable/) | 含まれる要素に対して列挙子を提供するオブジェクトのインターフェイスです。 |
| [IEnumerator](./ienumerator/) | いくつかの要素を反復処理するために使用できる列挙子のインターフェイス。このクラスのオブジェクトは、[System::MakeObject()](../system/makeobject/) 関数を使用してのみ割り当てるべきです。この型のインスタンスをスタック上で作成したり operator new を使用したりしないでください。そうするとランタイムエラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として使用してください。 |
| [IEqualityComparer](./iequalitycomparer/) | 等価性を比較する手段を提供するインターフェイスです。このクラスのオブジェクトは [System::MakeObject()](../system/makeobject/) 関数を使用してのみ割り当てるべきです。このタイプのインスタンスをスタック上で作成したり operator new を使用したりしないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを [System::SmartPtr](../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡してください。 |
| [IKVCollection](./ikvcollection/) | キーまたは値を含む辞書型コンテナのインターフェイスです。このクラスのオブジェクトは [System::MakeObject()](../system/makeobject/) 関数を使用してのみ割り当てるべきです。このタイプのインスタンスをスタック上で作成したり operator new を使用したりしないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを [System::SmartPtr](../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡してください。 |
| [IList](./ilist/) | 要素のインデックス付きコンテナのインターフェイスです。このクラスのオブジェクトは [System::MakeObject()](../system/makeobject/) 関数を使用してのみ割り当てるべきです。このタイプのインスタンスをスタック上で作成したり operator new を使用したりしないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを [System::SmartPtr](../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡してください。 |
| [ISet](./iset/) | 一意な要素の集合を含むコレクションのインターフェイスです。このクラスのオブジェクトは [System::MakeObject()](../system/makeobject/) 関数を使用してのみ割り当てるべきです。このタイプのインスタンスをスタック上で作成したり operator new を使用したりしないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを [System::SmartPtr](../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡してください。 |
| [KeyIterator](./keyiterator/) | [Dictionary](./dictionary/) のキーアクセスを提供するイテレータです。 |
| [KeyValuePair](./keyvaluepair/) | キーと値のペアです。この型はスタック上に割り当て、値渡しまたは参照渡しで関数に渡すべきです。この型のオブジェクトを管理するために [System::SmartPtr](../system/smartptr/) クラスを使用しないでください。 |
| [KVPairIterator](./kvpairiterator/) | イテレータを適応させ、std::pair を [Dictionary](./dictionary/) が期待する KVPair にラップします。 |
| [LinkedList](./linkedlist/) | [LinkedList](./linkedlist/) の前方宣言です。 |
| [LinkedListNode](./linkedlistnode/) | リンクリストのノードです。リンクリスト内でラップされた std::list のイテレータ上にラッパーを実装します。このクラスのオブジェクトは [System::MakeObject()](../system/makeobject/) 関数を使用してのみ割り当てるべきです。このタイプのインスタンスをスタック上で作成したり operator new を使用したりしないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを [System::SmartPtr](../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡してください。 |
| [List](./list/) | [List](./list/) の前方宣言です。 |
| [ListExt](./listext/) | 汎用的な [List](./list/) クラスで、[IListWrapper](../system.collections/ilistwrapper/) インターフェイスを実装しています。 |
| [ListPtr](./listptr/) | [List](./list/) ポインタで、アクセス演算子を持ちます。この型は他のオブジェクトの削除を管理するポインタです。スタック上に割り当て、値渡しまたは const 参照で関数に渡すべきです。 |
| [Queue](./queue/) | [Queue](./queue/) クラスの前方宣言です。 |
| [QueuePtr](./queueptr/) | [Queue](./queue/) ポインタです。この型は他のオブジェクトの削除を管理するポインタです。スタック上に割り当て、値渡しまたは const 参照で関数に渡すべきです。 |
| [ReverseEnumerator](./reverseenumerator/) | [Enumerator](./baseset/) で、コンテナを逆順に反復します。このクラスのオブジェクトは [System::MakeObject()](../system/makeobject/) 関数を使用してのみ割り当てるべきです。このタイプのインスタンスをスタック上で作成したり operator new を使用したりしないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを [System::SmartPtr](../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡してください。 |
| [SimpleEnumerator](./simpleenumerator/) | rbegin() と rend() 関数を使用して要素を直接保持するシンプルなコンテナ用イテレータクラスです。このクラスのオブジェクトは [System::MakeObject()](../system/makeobject/) 関数を使用してのみ割り当てるべきです。このタイプのインスタンスをスタック上で作成したり operator new を使用したりしないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを [System::SmartPtr](../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡してください。 |
| [SortedDictionary](./sorteddictionary/) | ソートされた辞書型の前方宣言です。 |
| [SortedDictionaryPtr](./sorteddictionaryptr/) | ソートされた辞書へのポインタで、アクセス演算子を持ちます。この型は他のオブジェクトの削除を管理するポインタです。スタック上に割り当て、値渡しまたは const 参照で関数に渡すべきです。 |
| [SortedList](./sortedlist/) | FlatMap 構造をラップしたソートリストです。このクラスのオブジェクトは [System::MakeObject()](../system/makeobject/) 関数を使用してのみ割り当てるべきです。このタイプのインスタンスをスタック上で作成したり operator new を使用したりしないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを [System::SmartPtr](../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡してください。 |
| [SortedListHelper](./sortedlisthelper/) | このヘルパークラスは、[IDictionary](./idictionary/) インターフェイスから来る仮想関数 get_Keys、get_Values を隠蔽し、異なる戻り値型の関数に置き換えるために使用されます。 |
| [SortedSet](./sortedset/) | [SortedSet](./sortedset/) クラスの前方宣言です。 |
| [SortedSetPtr](./sortedsetptr/) | [SortedSet](./sortedset/) 参照を保持するポインタです。この型は他のオブジェクトの削除を管理するポインタです。スタック上に割り当て、値渡しまたは const 参照で関数に渡すべきです。 |
| [Stack](./stack/) | [Stack](./stack/) クラスの前方宣言です。 |
| [StackPtr](./stackptr/) | [Stack](./stack/) ポインタです。この型は他のオブジェクトの削除を管理するポインタです。スタック上に割り当て、値渡しまたは const 参照で関数に渡すべきです。 |
| [ValueIterator](./valueiterator/) | [Dictionary](./dictionary/) の値アクセスを提供するイテレータです。 |
## Functions

| 関数 | 説明 |
| --- | --- |
| _net_binnary_search | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| _net_binnary_search | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| _net_binnary_search | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| _net_binnary_search | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
