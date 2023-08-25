<h2><a href="https://leetcode.com/problems/big-countries/">595. Big Countries</a></h2><h3>Easy</h3><hr><div class="sql-schema-wrapper__3VBi"><a class="sql-schema-link__3cEg" papago-id="4" papago-translate="cached">SQL Schema<svg viewBox="0 0 24 24" width="1em" height="1em" class="icon__1Md2" papago-id="4-1"><path fill-rule="evenodd" d="M10 6L8.59 7.41 13.17 12l-4.58 4.59L10 18l6-6z" papago-id="4-1-0"></path></svg></a></div><div><p><font papago-id="5" papago-translate="translated">Table: </font><code>World</code></p>

<pre papago-id="11" papago-translate="translated">+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| name        | varchar |
| continent   | varchar |
| area        | int     |
| population  | int     |
| gdp         | bigint  |
+-------------+---------+
name is the primary key (column with unique values) for this table.
Each row of this table gives information about the name of a country, the continent to which it belongs, its area, the population, and its GDP value.
</pre>

<p>&nbsp;</p>

<p papago-id="12" papago-translate="cached">A country is <strong papago-id="12-1">big</strong> if:</p>

<ul>
	<li><font papago-id="13" papago-translate="translated">it has an area of at least&nbsp;three million (i.e., </font><code>3000000 km<sup>2</sup></code><font papago-id="14" papago-translate="translated">), or</font></li>
	<li><font papago-id="15" papago-translate="translated">it has a population of at least&nbsp;twenty-five million (i.e., </font><code>25000000</code><font papago-id="16" papago-translate="translated">).</font></li>
</ul>

<p papago-id="17" papago-translate="cached">Write a solution to find the name, population, and area of the <strong papago-id="17-1">big countries</strong>.</p>

<p papago-id="18" papago-translate="cached">Return the result table in <strong papago-id="18-1">any order</strong>.</p>

<p papago-id="19" papago-translate="translated">The result format is in the following example.</p>

<p>&nbsp;</p>
<p><strong class="example" papago-id="20" papago-translate="translated">Example 1:</strong></p>

<pre papago-id="21" papago-translate="cached"><strong papago-id="21-0">Input:</strong> 
World table:
+-------------+-----------+---------+------------+--------------+
| name        | continent | area    | population | gdp          |
+-------------+-----------+---------+------------+--------------+
| Afghanistan | Asia      | 652230  | 25500100   | 20343000000  |
| Albania     | Europe    | 28748   | 2831741    | 12960000000  |
| Algeria     | Africa    | 2381741 | 37100000   | 188681000000 |
| Andorra     | Europe    | 468     | 78115      | 3712000000   |
| Angola      | Africa    | 1246700 | 20609294   | 100990000000 |
+-------------+-----------+---------+------------+--------------+
<strong papago-id="21-2">Output:</strong> 
+-------------+------------+---------+
| name        | population | area    |
+-------------+------------+---------+
| Afghanistan | 25500100   | 652230  |
| Algeria     | 37100000   | 2381741 |
+-------------+------------+---------+
</pre>
</div>