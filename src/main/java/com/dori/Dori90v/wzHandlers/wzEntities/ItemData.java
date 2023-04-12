package com.dori.Dori90v.wzHandlers.wzEntities;

import com.dori.Dori90v.enums.InventoryType;
import com.dori.Dori90v.enums.ScrollStat;
import com.dori.Dori90v.enums.SpecStat;
import com.dori.Dori90v.inventory.ItemRewardInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ItemData {
    private int itemId;
    private InventoryType invType;
    private boolean cash;
    private int price;
    private int slotMax = 200;
    private boolean tradeBlock;
    private boolean notSale;
    private String path = "";
    private boolean noCursed;
    private Map<ScrollStat, Integer> scrollStats = new HashMap<>();
    private Map<SpecStat, Integer> specStats = new HashMap<>();
    private int bagType;
    private boolean quest;
    private int reqQuestOnProgress;
    private Set<Integer> questIDs = new HashSet<>();
    private int mobID;
    private int mobHP;
    private int createID;
    private int npcID;
    private int linkedID;
    private boolean monsterBook;
    private boolean notConsume;
    private String script = "";
    private int scriptNPC;
    private int life;
    private int masterLv;
    private int reqSkillLv;
    private Set<Integer> skills = new HashSet<>();
    private int moveTo;
    private Set<ItemRewardInfo> listOfItemRewardInfo = new HashSet<>();
    private int skillId;
    private int grade;
    private Set<Integer> reqItemIds = new HashSet<>();

    public void addSkill(int skill) {
        skills.add(skill);
    }

    public void putScrollStat(ScrollStat scrollStat, int val) {
        getScrollStats().put(scrollStat, val);
    }

    public void addQuest(int questID) {
        getQuestIDs().add(questID);
    }

    public void putSpecStat(SpecStat ss, int i) {
        getSpecStats().put(ss, i);
    }

    public void addItemReward(ItemRewardInfo iri) {
        getListOfItemRewardInfo().add(iri);
    }
}
