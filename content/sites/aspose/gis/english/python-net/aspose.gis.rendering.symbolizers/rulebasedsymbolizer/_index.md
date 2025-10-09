---
title: RuleBasedSymbolizer Class
type: docs
weight: 100
url: /python-net/aspose.gis.rendering.symbolizers/rulebasedsymbolizer/
---

**Summary:** Applies a symbolizer to feature geometries according to user-defined rules.

**Module:** [aspose.gis.rendering.symbolizers](/psd/python-net/aspose.gis.rendering.symbolizers/)

**Full Name:** aspose.gis.rendering.symbolizers.RuleBasedSymbolizer

**Inheritance:** VectorSymbolizer

**Aspose.PSD Version:** 25.9.0

## **Constructors**
| **Name** | **Description** |
| :- | :- |
| [RuleBasedSymbolizer()](#RuleBasedSymbolizer__1) | Initializes a new instance of the RuleBasedSymbolizer class |
## **Properties**
| **Name** | **Type** | **Access** | **Description** |
| :- | :- | :- | :- |
| null [static] | [NullVectorSymbolizer](/psd/python-net/aspose.gis.rendering.symbolizers/nullvectorsymbolizer) | r | The [NullVectorSymbolizer](/psd/python-net/aspose.gis.rendering.symbolizers/nullvectorsymbolizer/) draws nothing and effectively skips rendering of a geometry it is applied to. |
## **Methods**
| **Name** | **Description** |
| :- | :- |
| [add(rule)](#add_rule_1) | Adds a rule. |
| [add_else_rule(symbolizer)](#add_else_rule_symbolizer_2) | Adds a symbolizer that will be applied to features that don't match any filtering rule. |


### Constructor: RuleBasedSymbolizer() {#RuleBasedSymbolizer__1}


```
 RuleBasedSymbolizer() 
```

Initializes a new instance of the RuleBasedSymbolizer class

### Method: add(rule) {#add_rule_1}


```
 add(rule) 
```

Adds a rule.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| rule | [Rule](/psd/python-net/aspose.gis.rendering.symbolizers/rule) | Rule to add. |

### Method: add_else_rule(symbolizer) {#add_else_rule_symbolizer_2}


```
 add_else_rule(symbolizer) 
```

Adds a symbolizer that will be applied to features that don't match any filtering rule.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| symbolizer | [VectorSymbolizer](/psd/python-net/aspose.gis.rendering.symbolizers/vectorsymbolizer) | A symbolizer. |

