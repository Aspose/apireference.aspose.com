---
title: Class XbrlInstance
second_title: Aspose.Finance for .NET API リファレンス
description: Aspose.Finance.Xbrl.XbrlInstance クラス. XBRL インスタンスはxbrl タグを持つルート要素を持つ XML フラグメントです XBRL インスタンスにはビジネス レポートのファクトが含まれており各ファクトはConceptサポートする DTS で定義されています XBRL インスタンスにはインスタンス内の事実を解釈するために必要な追加情報を提供するコンテキストとユニットも含まれています
type: docs
weight: 8250
url: /ja/net/aspose.finance.xbrl/xbrlinstance/
---
## XbrlInstance class

XBRL インスタンスは、xbrl タグを持つルート要素を持つ XML フラグメントです。 XBRL インスタンスにはビジネス レポートのファクトが含まれており、各ファクトは[`Concept`](../concept/)サポートする DTS で定義されています。 XBRL インスタンスには、インスタンス内の事実を解釈するために必要な追加情報を提供するコンテキストとユニットも含まれています。

```csharp
public class XbrlInstance
```

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [ArcroleReferences](../../aspose.finance.xbrl/xbrlinstance/arcrolereferences/) { get; set; } | のコレクションを取得または設定します[`ArcroleReference`](../arcrolereference/) XBRL インスタンス内のオブジェクト. |
| [Contexts](../../aspose.finance.xbrl/xbrlinstance/contexts/) { get; set; } | のコレクションを取得または設定します[`Context`](../context/) XBRL インスタンス内のオブジェクト. |
| [Facts](../../aspose.finance.xbrl/xbrlinstance/facts/) { get; } | のコレクションを取得します[`Fact`](../fact/) XBRL インスタンス内のオブジェクト. |
| [FootnoteLinks](../../aspose.finance.xbrl/xbrlinstance/footnotelinks/) { get; set; } | のコレクションを取得または設定します[`FootnoteLink`](../footnotelink/) XBRL インスタンス内のオブジェクト. |
| [Items](../../aspose.finance.xbrl/xbrlinstance/items/) { get; } | のコレクションを取得します[`Item`](../item/) XBRL インスタンス内のオブジェクト. |
| [LinkbaseRefCollection](../../aspose.finance.xbrl/xbrlinstance/linkbaserefcollection/) { get; } | を取得します[`LinkbaseRefCollection`](./linkbaserefcollection/)の中に`XbrlInstance`. |
| [RoleReferences](../../aspose.finance.xbrl/xbrlinstance/rolereferences/) { get; set; } | のコレクションを取得または設定します[`RoleReference`](../rolereference/) XBRL インスタンス内のオブジェクト. |
| [SchemaLocation](../../aspose.finance.xbrl/xbrlinstance/schemalocation/) { get; set; } | スキーマの場所を取得または設定します |
| [SchemaRefs](../../aspose.finance.xbrl/xbrlinstance/schemarefs/) { get; } | SchemaRef コレクションを取得します。 |
| [Units](../../aspose.finance.xbrl/xbrlinstance/units/) { get; set; } | のコレクションを取得または設定します[`Unit`](../unit/) XBRL インスタンス内のオブジェクト. |
| [ValidationErrors](../../aspose.finance.xbrl/xbrlinstance/validationerrors/) { get; } | 検証エラーのコレクションを取得します。 |
| [XbrlDocument](../../aspose.finance.xbrl/xbrlinstance/xbrldocument/) { get; } | を取得[`XbrlDocument`](./xbrldocument/)このインスタンスを含む. |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [CreateElement](../../aspose.finance.xbrl/xbrlinstance/createelement/)(string, string, string) | 新しい要素を作成します。 |
| [GetAllLinkbaseRefCollections](../../aspose.finance.xbrl/xbrlinstance/getalllinkbaserefcollections/)() | xbrl インスタンスおよびスキーマ参照内のすべてのリンクベース参照コレクションを取得します。 |
| [GetArcroleTypeByURI](../../aspose.finance.xbrl/xbrlinstance/getarcroletypebyuri/)(string) | 指定された uri. を持つ ArcroleType を取得します |
| [GetConceptById](../../aspose.finance.xbrl/xbrlinstance/getconceptbyid/)(string) | 指定されたidを持つ概念を取得します. |
| [GetConceptByLoc](../../aspose.finance.xbrl/xbrlinstance/getconceptbyloc/)(Loc) | ロケーターで概念を取得します。 |
| [GetConceptByName](../../aspose.finance.xbrl/xbrlinstance/getconceptbyname/)(string) | 指定した名前の概念を取得します。 |
| [GetConceptByUriAndName](../../aspose.finance.xbrl/xbrlinstance/getconceptbyuriandname/)(string, string) | 指定された uri と名前を持つ概念を取得します。 |
| [GetContextById](../../aspose.finance.xbrl/xbrlinstance/getcontextbyid/)(string) | 指定された id を持つコンテキストを取得します。 |
| [GetPresentationLinks](../../aspose.finance.xbrl/xbrlinstance/getpresentationlinks/)(string, string) | xbrl インスタンスのプレゼンテーション リンクを取得します。 |
| [GetRoleTypeByURI](../../aspose.finance.xbrl/xbrlinstance/getroletypebyuri/)(string) | 指定された uri. を持つ RoleType を取得します |
| [GetUnitById](../../aspose.finance.xbrl/xbrlinstance/getunitbyid/)(string) | 指定されたIDを持つユニットを取得します. |
| [IsValid](../../aspose.finance.xbrl/xbrlinstance/isvalid/)() | この XBRL インスタンスが有効かどうかをチェックします。 |
| [Validate](../../aspose.finance.xbrl/xbrlinstance/validate/)() | この XBRL インスタンスを検証します。 |

### 関連項目

* 名前空間 [Aspose.Finance.Xbrl](../../aspose.finance.xbrl/)
* 組み立て [Aspose.Finance](../../)


