---
title: Point
second_title: Aspose.Sildes for Node.js via Java API Reference
description: 
type: docs

url: /nodejs-java/aspose.slides/point/
---

## Point class

 Represent animation point.
 

## Functions

| Name | Description |
| --- | --- |
| [Point](point)() | Default function. |
| [Point](point)(float, Object, String) | Create animation point with time, value and formula. |

## Functions

| Name | Description |
| --- | --- |
| [getFormula](getformula)() | Formulas within values, from, to, by attributes can be made up of these: Standard arithmetic operators: +, -, *, /, ^, % (mod) Constants: pi e Conditional operators: abs, min, max, ? (if) Comparison operators: '==', '&gt;=', '', '!=', '!' Trigonometric operators: sin(), cos(), tan(), asin(), acos(), atan() Natural logarithm ln() Property references (host supported properties) for example: "#ppt_x+(cos(-2*pi*(1-$))*-#ppt_x-sin(-2*pi*(1-$))*(1-#ppt_y))*(1-$)" Read/write String. |
| [getTime](gettime)() | Represents time value. Read/write float. |
| [getValue](getvalue)() | Represents point value. Only: bool, ColorFormat, float, int, string. Read/write Object. |
| [setFormula](setformula)(String) | Formulas within values, from, to, by attributes can be made up of these: Standard arithmetic operators: +, -, *, /, ^, % (mod) Constants: pi e Conditional operators: abs, min, max, ? (if) Comparison operators: '==', '&gt;=', '', '!=', '!' Trigonometric operators: sin(), cos(), tan(), asin(), acos(), atan() Natural logarithm ln() Property references (host supported properties) for example: "#ppt_x+(cos(-2*pi*(1-$))*-#ppt_x-sin(-2*pi*(1-$))*(1-#ppt_y))*(1-$)" Read/write String. |
| [setTime](settime)(float) | Represents time value. Read/write float. |
| [setValue](setvalue)(Object) | Represents point value. Only: bool, ColorFormat, float, int, string. Read/write Object. |
