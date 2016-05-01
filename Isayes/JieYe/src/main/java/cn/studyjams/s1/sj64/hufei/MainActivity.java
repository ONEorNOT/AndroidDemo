package cn.studyjams.s1.sj64.hufei;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends BaseActivity implements View.OnClickListener {

    private long exitTime = 0L;
    private String cq_content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getViews();
    }

    private void getViews() {
        Button one = $(R.id.id_cq_one);
        one.setOnClickListener(this);
        Button two = $(R.id.id_cq_two);
        two.setOnClickListener(this);
        Button three = $(R.id.id_cq_three);
        three.setOnClickListener(this);
        Button four = $(R.id.id_cq_four);
        four.setOnClickListener(this);
        Button five = $(R.id.id_cq_five);
        five.setOnClickListener(this);

    }

    @SuppressWarnings("unchecked")
    public <TT> TT $(int id) {
        return (TT) findViewById(id);
    }

    Intent intent;

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.id_cq_one:
                intent = new Intent(this, DetailActivity.class);
                intent.putExtra("content", getContent(1));
                intent.putExtra("flag", "1");
                startActivity(intent);
                break;
            case R.id.id_cq_two:
                intent = new Intent(this, DetailActivity.class);
                intent.putExtra("content", getContent(2));
                intent.putExtra("flag", "2");
                startActivity(intent);
                break;
            case R.id.id_cq_three:
                intent = new Intent(this, DetailActivity.class);
                intent.putExtra("content", getContent(3));
                intent.putExtra("flag", "3");
                startActivity(intent);
                break;
            case R.id.id_cq_four:
                intent = new Intent(this, DetailActivity.class);
                intent.putExtra("content", getContent(4));
                intent.putExtra("flag", "4");
                startActivity(intent);
                break;
            case R.id.id_cq_five:
                intent = new Intent(this, DetailActivity.class);
                intent.putExtra("content", getContent(5));
                intent.putExtra("flag", "5");
                startActivity(intent);
                break;
            default:
                break;
        }
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK &&
                event.getAction() == KeyEvent.ACTION_DOWN) {

            if ((System.currentTimeMillis() - exitTime) > 20000) {
                showToast(getString(R.string.click_again_to_quit));
                exitTime = System.currentTimeMillis();
            } else {
                finish();
                System.exit(0);
            }
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    private void showToast(String msg) {
        Toast toast = Toast.makeText(this, msg, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.show();
    }

    public String getContent(int num) {
        switch (num) {
            case 1:
                cq_content = "[ 战略联结点：承东启西、左右逢源 ]\n" +
                        "　　习总说，重庆区位优势明显，战略地位重要，在国家对外开放和区域经济发展中具有独特地位，" +
                        "要建设好内陆国际物流枢纽、口岸高地、内陆开放高地。" +
                        "这实际上把重庆的定位放在了全球化和区域经济一体化的层面来考量，" +
                        "对应的是“一带一路”与长江经济带建设，重庆的确是承东启西、左右逢源了。" +
                        "无论是东西双向开放，还是全方位开放，处于三大战略联结点的重庆，" +
                        "在地缘政治经济中无疑将扮演更加重要的角色。";
                break;
            case 2:
                cq_content = "[ 内陆开放高地：参与国际分工，融入全球市场 ]\n" +
                        "　　但仅有区位优势和高端定位，一个地方要快速发展，要热火起来，也是不容易的。" +
                        "重庆之所以能保持不错的增长，主要还是得益于内陆开放，参与国际分工，融入全球市场。" +
                        "通过不断的拓展内陆开放的通道、平台、功能、开放型制度体系，逐渐的把重庆经济纳入到全球市场体系中，" +
                        "从而初步确立了其全球最大笔电生产基地、中国最大汽车生产基地的地位。" +
                        "“十二五”期间，重庆进出口总额增长5倍多，实际利用外资连续五年保持在100亿美元以上，" +
                        "世界500强企业落户262家，内陆开放可谓业绩突出。\n" +
                        "\n" +
                        "　　在融入全球市场体系的过程中，重庆在城市方面，以功能为导向，" +
                        "逐渐搭建了服务中西部市场和国际市场的城市核心功能体系：" +
                        "包括两江新区、中新(重庆)示范项目等开放平台体系；铁路、水港、空港三个“三合一”开放口岸体系；" +
                        "以渝新欧国际铁路、长江黄金水道等为代表的开放通道体系；以简政放权、服务投资便利化、贸易便利化，" +
                        "并与国际接轨的开放型政策体系。" +
                        "这就使重庆的城市功能体系，从区域经济层面的城市功能，逐渐延伸到国家中心城市的定位。\n" +
                        "\n" +
                        "　　如今，高层对重庆的定位实际上又进一步，提出了国际物流枢纽、口岸高地和内陆开放高地的新定位，" +
                        "实际上为重庆打造面向全球的内陆开放升级版奠定了决策、理论和现实基础，" +
                        "今年全国人大重庆代表团全团建议主要围绕支持重庆打通“一带一路”与长江经济带互联互通枢纽做文章，" +
                        "2015年全团建议是支持重庆建设内陆开放高地，具体又开了中新项目、开放平台、自贸区三个方面的清单，" +
                        "可谓是这一政经逻辑的体现，那就是要把重庆建设成为“一带一路”与长江经济带的西部中心枢纽和战略支撑，" +
                        "要成为面向国际国内市场的枢纽、中心、口岸、高地。";
                break;
            case 3:
                cq_content = "[ 产业链整合：实现城市战略全球化布局 ]\n" +
                        "　　高层的支持、国家的决策，显然只是一个重要方面，重庆自身还需要努力，这个方面，就是产业方面。" +
                        "围绕全球产业链、价值链、供应链的整合，先进要素的整合，重庆逐步形成了基于供需两端同步发力的一个体系。" +
                        "近期针对重庆经济表现，各方的讨论也很多了，但是如何简明扼要的来理解重庆如何促进经济的增长和发展，" +
                        "其实是不容易说清楚的一件事。论者前不久找人设计了三个图，发现用来解释重庆经济现象正好。\n" +
                        "\n" +
                        "　　重庆近年来的经济实践，实质上从经济学意义上讲，就是顺应全球产业大重组的战略机遇，" +
                        "抓住内陆地区如何参与国际国内市场这个关键，积极作为，重构产业链、价值链、供应链，" +
                        "并把全球招商和金融资本、产业资本融合作为整合先进要素的抓手，从而迅速的实现了城市战略的全球化布局。\n" +
                        "\n" +
                        "　　从沿海开放到内陆开放，改革开放前三十年，主要是以东部沿海地区的开放为重点，" +
                        "参与国际市场的模式主要是“两头在外”，路径是工业化推动城市化、形成城市群。" +
                        "发展至今，形成珠三角、长三角、环渤海三大城市群，但赚取的利润也很微薄，主要是制造环节的费用，" +
                        "但这也是发展中的必经阶段，我们主要是世界工厂，还没有形成具有很好消费能力的世界市场。\n" +
                        "\n" +
                        "　　但2008年以来的金融危机，导致新一轮的全球性产业大重组大转移，中西部市场成为产业大转移重要承接地，" +
                        "成为连通欧亚大陆的战略枢纽和提振国内经济整体力量的重要阵地。重庆在这个过程中，" +
                        "利用全球产能过剩、资本过剩的机遇，既搞“两头在内”——内需市场，也搞“一头在内、一头在外”——外需市场，" +
                        "并且除了制造环节，还要求研发、结算、总部、关键零部件都要按照集群化的思路来做，" +
                        "实际上就降低了产业链的配套成本和产品内部的物流成本。这个基于全球性产业重组的“基地化布局、" +
                        "垂直化整合、集群化发展”的思路，既符合经济学规律，也解决了企业与国际市场对接的问题，" +
                        "可谓是系统性的解决方案，也是重庆经济增长故事的核心。如果用2016年李克强总理在政府工作报告的话讲，" +
                        "就是““创新内陆和沿边开放模式，打造新的外向型产业集群，引导外资更多投向中西部地区”。" +
                        "2014年李总在《政府工作报告》中提出“扩展内陆沿边开放，让广袤大地成为对外开放的热土”，" +
                        "2015年《政府工作报告》提出“扩大内陆和沿边开放，促进经济技术开发区创新发展”。" +
                        "从三年来的政府报告看，重庆对国家战略意图理解之深，贯彻之透彻，由此可见一斑。" +
                        "如今，无论是重庆汽车工业或者电子信息产业，都采取了“整机+关键零部件+研发+结算+跨境电商”" +
                        "等一系列制造业+现代服务业的路径，形成了产业面多点支撑的格局。";
                break;
            case 4:
                cq_content = "[ 价值链重构：优化产业生态，改变傻大黑粗印象 ]\n" +
                        "　　伴随产业链的重构，是价值链的提升。利用中西部新兴大市场的谈判地位，传统的招商引资常常是利用优惠政策，" +
                        "把客商引来。由于地方政府相互竞争，导致处于不利的谈判地位，重庆充分利用跨国资本、国内资本、" +
                        "华裔华侨资本开拓内陆新兴市场的契机，优化产业生态、布局创新要素，实现了价值链的提升。如今，" +
                        "重庆汽车工业正向新能源汽车方向转型升级，电子信息产业正向“芯、屏、器、核”的智能终端转型升级，" +
                        "再加上金融环节、服务贸易环节的多重利润，重庆在价值链的布局上实际上改变了傻大黑粗的印象，工业、" +
                        "服务业的利润都不错，金融增加值更是占比9%，两江新区更是高达12%。\n" +
                        "\n" +
                        "　　尤其值得一提的是，依托产业资本与金融资本的结合，重庆在布局内陆新兴制造业、新兴服务业上着力颇多，" +
                        "破解了制约新兴产业发展在资本、技术、市场上的三大难题。通过成立800亿元的母基金，对缺资金的，" +
                        "进行股权投资，形成了京东方的投资案例；对缺市场订单的，通过整合市场订单，融资租赁等方式进行，" +
                        "比如通航产业、机器人产业就这样发展了起来；对缺技术的，那就引进消化再吸收，金融资本辅之招商引资，" +
                        "从而形成了以两江新区为核心、西永微电园、物流园等为骨干的重庆产业版图。";
                break;
            case 5:
                cq_content = "[ 供应链升级：渝新欧水铁联运打通与欧洲最后一公里 ]\n" +
                        "　　产业集群发展降低了配套成本、进项物流成本、通过金融资本与产业资本的融合降低了融资成本、" +
                        "系列的改革降低制度成本，重庆要做的就是解决产品到目标消费市场的问题了——无论是国际市场，" +
                        "还是国内市场，都涉及出项物流和供应链的优化。为此，通过渝新欧国际通道、长江黄金水道、孟中印缅经济走廊，" +
                        "重庆实际上构筑了以城市为核心的开放通道体系，如今，渝新欧每箱公里成本为0.55美元，基本与海运价格持平，" +
                        "但海运要40多天，且受制于马六甲困局，作为丝绸之路经济带的重要支撑，渝新欧与长江黄金水道的水铁联运，" +
                        "实际上打通了繁荣的中国与富裕的欧洲最后一公里，其地缘政治和经济收益难以估量。也正因如此，" +
                        "新加坡把中新第三个合作项目以重庆为中心布局，产业合作选择在物流、金融、航空、信息技术四个方面，" +
                        "可谓抓住了未来发展的关键，对重庆和国家的全球化拓展，还是新加坡抢占亚欧新兴领域机会，都是双赢。\n" +
                        "\n" +
                        "　　火了！高层对一个地区这样的赞美其实并不多见，重庆人在欣喜之余，切不可骄傲。" +
                        "产业要升级，关键是人才要跟上，要参与国际分工，实现加工贸易向服务贸易并举，" +
                        "实现先进制造业与现代服务业并举，创新发展与生态环境协调，社会与经济发展协调，" +
                        "区域经济治理、文化治理、社会治理能力协调，重庆要做的事情还很多，尤其是构建与产业、" +
                        "城市国际竞争力相适应的创新体系、人才体系还差距很大，尚需继续以全球化的视野布局和努力。";
                break;
            default:
                break;
        }

        return cq_content;
    }
}
