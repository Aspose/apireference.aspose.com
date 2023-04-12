---
title: Class SchemaRef
second_title: Aspose.Finance for .NET API リファレンス
description: Aspose.Finance.Xbrl.SchemaRef クラス. このクラスはXBRL インスタンスをサポートする DTS の一部となる分類スキーマへの参照です
type: docs
weight: 8060
url: /ja/net/aspose.finance.xbrl/schemaref/
---
## SchemaRef class

このクラスは、XBRL インスタンスをサポートする DTS の一部となる分類スキーマへの参照です。

```csharp
public class SchemaRef : SimpleLink
```

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [Actuate](../../aspose.finance.xbrl/simplelink/actuate/) { get; set; } | 単純なリンク作動属性を取得または設定します. |
| [Arcrole](../../aspose.finance.xbrl/simplelink/arcrole/) { get; set; } | シンプル リンク アークロールを取得または設定します。 |
| [ArcroleTypes](../../aspose.finance.xbrl/schemaref/arcroletypes/) { get; set; } | のコレクションを取得します[`ArcroleType`](../arcroletype/)スキーマ内のオブジェクト. |
| [ChildSchemas](../../aspose.finance.xbrl/schemaref/childschemas/) { get; } | 子スキーマを取得します。 |
| [Concepts](../../aspose.finance.xbrl/schemaref/concepts/) { get; } | のコレクションを取得します[`Concept`](../concept/) schema. で定義 |
| [Href](../../aspose.finance.xbrl/simplelink/href/) { get; set; } | 単純なリンクの href URI を取得または設定します。 |
| [LinkbaseRefCollection](../../aspose.finance.xbrl/schemaref/linkbaserefcollection/) { get; } | を取得します[`LinkbaseRefCollection`](./linkbaserefcollection/)スキーマで. |
| [NamespacePrefix](../../aspose.finance.xbrl/schemaref/namespaceprefix/) { get; set; } | XBRL インスタンス内のスキーマの名前空間プレフィックスを取得または設定します。 |
| [NamespaceUri](../../aspose.finance.xbrl/schemaref/namespaceuri/) { get; set; } | XBRL インスタンス内のスキーマの名前空間 URI を取得または設定します。 |
| [Role](../../aspose.finance.xbrl/simplelink/role/) { get; set; } | 単純なリンクの役割を取得または設定します。 |
| [RoleTypes](../../aspose.finance.xbrl/schemaref/roletypes/) { get; set; } | のコレクションを取得します[`RoleType`](../roletype/)スキーマ内のオブジェクト. |
| [Show](../../aspose.finance.xbrl/simplelink/show/) { get; set; } | 簡易リンク表示属性を取得または設定します。 |
| [TargetNamespace](../../aspose.finance.xbrl/schemaref/targetnamespace/) { get; set; } | スキーマのターゲット名前空間を取得または設定します。 |
| [Title](../../aspose.finance.xbrl/simplelink/title/) { get; set; } | 単純なリンクのタイトルを取得または設定します。 |
| [Type](../../aspose.finance.xbrl/xlink/type/) { get; } | リンクタイプを取得します. |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [GetArcroleTypeByURI](../../aspose.finance.xbrl/schemaref/getarcroletypebyuri/)(string) | 指定された uri. を持つ ArcroleType を取得します |
| [GetConceptById](../../aspose.finance.xbrl/schemaref/getconceptbyid/)(string) | 指定されたidを持つ概念を取得します. |
| [GetConceptByLoc](../../aspose.finance.xbrl/schemaref/getconceptbyloc/)(Loc) | ロケーターで概念を取得します。 |
| [GetConceptByName](../../aspose.finance.xbrl/schemaref/getconceptbyname/)(string) | 指定した名前の概念を取得します。 |
| [GetRoleTypeByURI](../../aspose.finance.xbrl/schemaref/getroletypebyuri/)(string) | 指定された uri. を持つ RoleType を取得します |

### 関連項目

* class [SimpleLink](../simplelink/)
* 名前空間 [Aspose.Finance.Xbrl](../../aspose.finance.xbrl/)
* 組み立て [Aspose.Finance](../../)


